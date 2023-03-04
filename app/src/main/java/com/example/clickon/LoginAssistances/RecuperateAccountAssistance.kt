package com.example.clickon.LoginAssistances

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.clickon.databinding.AccountRecuperateAssistanceBinding
import com.example.clickon.databinding.LoginAssistancesBinding
import com.google.firebase.auth.FirebaseAuth

class RecuperateAccountAssistance : AppCompatActivity() {

    private lateinit var mAuth: FirebaseAuth
    private lateinit var binding: AccountRecuperateAssistanceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AccountRecuperateAssistanceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mAuth = FirebaseAuth.getInstance()

        binding.buttonAccountRecuperateAssistance.setOnClickListener { validateData() }

    }

    private fun validateData() {
        val email = binding.editEmailAccountRecuperateAssistance.text.toString().trim()



        if (!email.isEmpty()) {
            binding.progressBarAccountRecuperateAssistance.setVisibility(View.GONE) // oculta a ProgressBar em caso de erro
            recuperateAccountFirebase(email)
            return
        } else {
            Toast.makeText(this, "Email inválido", Toast.LENGTH_SHORT).show()
        }
    }

    private fun recuperateAccountFirebase(email: String) {
        mAuth.sendPasswordResetEmail(email).addOnCompleteListener(this) { task ->
            if (task.isSuccessful) {
                Toast.makeText(
                    this,
                    "Bem-vindo de volta!",
                    Toast.LENGTH_SHORT
                ).show()
                finish()
                val intent = Intent(this, LoginAssistancesBinding::class.java)
                startActivity(intent)
            } else {
                binding.progressBarAccountRecuperateAssistance.visibility = View.GONE
                Toast.makeText(this, "Falha ao entrar", Toast.LENGTH_SHORT).show()
            }
        }
    }
}