package com.example.clickon.LoginUsers

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.clickon.databinding.ActivityLoginBinding
import com.example.clickon.pages.ProductsActivity
import com.google.firebase.auth.FirebaseAuth

class Login : AppCompatActivity() {

    private lateinit var mAuth: FirebaseAuth
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mAuth = FirebaseAuth.getInstance()

        binding.textCreateCount.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        binding.textaccountRecuperate.setOnClickListener {
            startActivity(Intent(this, RecuperateAccountActivity::class.java))
        }

        binding.buttonLogin.setOnClickListener { validateData() }

    }

    private fun validateData() {
        val email = binding.editEmailLogin.text.toString().trim()
        val password = binding.editPasswordLogin.text.toString().trim()

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

        // Criar a conta do usuário
        loginFirebase( email, password)
    }

    private fun loginFirebase( email: String, password: String) {
        mAuth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    Toast.makeText(
                        this,
                        "Bem-vindo de volta!",
                        Toast.LENGTH_SHORT
                    ).show()
                    finish()
                    val intent = Intent(this, ProductsActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Falha ao entrar", Toast.LENGTH_SHORT).show()
                }
            }


    }

    private fun isEmailValid(email: String): Boolean {
        val emailRegex = Regex("[a-zA-Z0-9._-]+@[a-z]+\\.[a-z]+(\\.[a-z]+)?")
        return emailRegex.matches(email)
    }
}