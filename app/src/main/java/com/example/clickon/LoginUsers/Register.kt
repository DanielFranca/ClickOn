package com.example.clickon.LoginUsers

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import com.example.clickon.PasswordStrengthCalculator
import com.example.clickon.R
import com.example.clickon.StrengthLevel
import com.example.clickon.databinding.ActivityRegisterBinding
import com.example.clickon.pages.ProductsActivity
import com.google.firebase.auth.FirebaseAuth

class RegisterActivity : AppCompatActivity() {

    private lateinit var mAuth: FirebaseAuth
    private lateinit var binding: ActivityRegisterBinding
    private var color: Int = R.color.red

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mAuth = FirebaseAuth.getInstance()

        binding.buttonCreateCount.setOnClickListener { validateData() }

        val passwordStrengthCalculator = PasswordStrengthCalculator()
        binding.editPasswordRegister.addTextChangedListener(passwordStrengthCalculator)

        // Observers
        passwordStrengthCalculator.strengthLevel.observe(this, Observer { strengthLevel ->
            displayStrengthLevel(strengthLevel)
        })
        passwordStrengthCalculator.strengthColor.observe(this, Observer { strengthColor ->
            color = strengthColor
        })

        passwordStrengthCalculator.lowerCase.observe(this, Observer { value ->
            displayPasswordSuggestions(value, binding.lowerCaseImg, binding.lowerCaseTxt)
        })
        passwordStrengthCalculator.upperCase.observe(this, Observer { value ->
            displayPasswordSuggestions(value, binding.upperCaseImg, binding.upperCaseTxt)
        })
        passwordStrengthCalculator.digit.observe(this, Observer { value ->
            displayPasswordSuggestions(value, binding.digitImg, binding.digitTxt)
        })
        passwordStrengthCalculator.specialChar.observe(this, Observer { value ->
            displayPasswordSuggestions(value, binding.specialCharImg, binding.specialCharTxt)
        })
    }

    private fun displayPasswordSuggestions(value: Int, imageView: ImageView, textView: TextView) {
        if (value == 1) {
            imageView.setColorFilter(ContextCompat.getColor(this, R.color.green))
            textView.setTextColor(ContextCompat.getColor(this, R.color.green))
        } else {
            imageView.setColorFilter(ContextCompat.getColor(this, R.color.gray))
            textView.setTextColor(ContextCompat.getColor(this, R.color.gray))
        }
    }

    private fun displayStrengthLevel(strengthLevel: StrengthLevel) {
        binding.buttonCreateCount.isEnabled = strengthLevel == StrengthLevel.MUITOFORTE

        binding.strengthLevelTxt.text = strengthLevel.name
        binding.strengthLevelTxt.setTextColor(ContextCompat.getColor(this, color))
        binding.strengthLevelIndicator.setBackgroundColor(ContextCompat.getColor(this, color))
    }

    private fun validateData() {
        val name = binding.editNameRegister.text.toString().trim()
        val email = binding.editEmailLogin.text.toString().trim()
        val password = binding.editPasswordRegister.text.toString().trim()
        val cpf = binding.editCpf.text.toString().trim()

        binding.progressBar.setVisibility(View.VISIBLE)

        // Validar o email
        if (email.isEmpty()) {
            binding.progressBar.setVisibility(View.GONE) // oculta a ProgressBar em caso de erro
            Toast.makeText(this, "Informe seu email", Toast.LENGTH_SHORT).show()
            return
        }
        if (!isEmailValid(email)) {
            binding.progressBar.setVisibility(View.GONE) // oculta a ProgressBar em caso de erro
            Toast.makeText(this, "Email inválido", Toast.LENGTH_SHORT).show()
            return
        }

        // Validar a senha
        if (password.isEmpty()) {
            binding.progressBar.setVisibility(View.GONE)
            Toast.makeText(this, "Informe sua senha", Toast.LENGTH_SHORT).show()
            return
        }

        // Validar o nome
        if (name.isEmpty()) {
            binding.progressBar.setVisibility(View.GONE)
            Toast.makeText(this, "Informe seu nome", Toast.LENGTH_SHORT).show()
            return
        } else if (!isValidName(name)) {
            binding.progressBar.setVisibility(View.GONE)
            Toast.makeText(this, "Nome inválido", Toast.LENGTH_SHORT).show()
            return
        }

        // Validar o CPF
        if (cpf.isEmpty()) {
            binding.progressBar.setVisibility(View.GONE)
            Toast.makeText(this, "Informe seu CPF", Toast.LENGTH_SHORT).show()
            return
        } else if (!validarCpf(cpf)) {
            binding.progressBar.setVisibility(View.GONE)
            Toast.makeText(this, "CPF inválido", Toast.LENGTH_SHORT).show()
            return
        }

        // Criar a conta do usuário
        createCountFirebase( email, cpf)
    }

    private fun createCountFirebase( email: String, password: String) {
        mAuth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    Toast.makeText(this, "Você agora é um Click, seja Bem-vindo!", Toast.LENGTH_SHORT).show()
                    finish()
                    val intent = Intent(this, ProductsActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Falha ao criar conta", Toast.LENGTH_SHORT).show()
                }
            }
    }

    fun isValidName(name: String): Boolean {
        val nameRegex = "^[a-zA-ZÀ-ÿ]+([ ][a-zA-ZÀ-ÿ]+)*$".toRegex()
        return nameRegex.matches(name)
    }

    private fun validarCpf(cpf: String): Boolean {
        // Remove caracteres especiais do CPF
        val cpfSemCaracteresEspeciais = cpf.replace("[^\\d]".toRegex(), "")

        // Verifica se o CPF tem 11 dígitos
        if (cpfSemCaracteresEspeciais.length != 11) {
            return false
        }

        // Verifica se todos os dígitos são iguais
        if (cpfSemCaracteresEspeciais.all { it == cpfSemCaracteresEspeciais[0] }) {
            return false
        }

        // Calcula os dígitos verificadores
        val digitos = cpfSemCaracteresEspeciais.substring(0, 9).toCharArray()
        var soma = 0
        for (i in 0..8) {
            soma += digitos[i].toString().toInt() * (10 - i)
        }
        var resto = soma % 11
        var dv1 = if (resto < 2) 0 else 11 - resto

        soma = 0
        for (i in 0..8) {
            soma += digitos[i].toString().toInt() * (11 - i)
        }
        soma += dv1 * 2
        resto = soma % 11
        var dv2 = if (resto < 2) 0 else 11 - resto

        val cpfFormatado = "$dv1$dv2"

        // Verifica se os dígitos verificadores são válidos
        return cpfFormatado == "$dv1$dv2"
    }

    private fun isEmailValid(email: String): Boolean {
        val emailRegex = Regex("[a-zA-Z0-9._-]+@[a-z]+\\.[a-z]+(\\.[a-z]+)?")
        return emailRegex.matches(email)
    }
}



