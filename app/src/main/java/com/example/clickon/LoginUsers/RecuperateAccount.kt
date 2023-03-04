package com.example.clickon.LoginUsers

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.clickon.databinding.ActivityAccountrecuperateBinding
import com.google.firebase.auth.FirebaseAuth

class RecuperateAccountActivity : AppCompatActivity() {

    private lateinit var mAuth: FirebaseAuth
    private lateinit var binding: ActivityAccountrecuperateBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAccountrecuperateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mAuth = FirebaseAuth.getInstance()

        binding.buttonAccountRecuperate.setOnClickListener { validateData() }

    }

    private fun validateData() {
        val email = binding.editEmailAccountRecuperate.text.toString().trim()



        if (!email.isEmpty()) {
            binding.progressBarAccountRecuperate.setVisibility(View.GONE) // oculta a ProgressBar em caso de erro
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
                val intent = Intent(this, Login::class.java)
                startActivity(intent)
            } else {
                binding.progressBarAccountRecuperate.visibility = View.GONE
                Toast.makeText(this, "Falha ao entrar", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

