package com.example.clickon.ui.Profile

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.clickon.LoginAssistances.AssistancesLogin
import com.example.clickon.LoginUsers.Login
import com.example.clickon.databinding.FragmentProfileBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class ProfileFragment : Fragment() {

    private lateinit var mAuth: FirebaseAuth
    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(inflater, container, false)


        // Localiza o botão "Entre"
        val btnLogin = binding.btnEntrar

        // Configura o listener para o botão "Entre"
        btnLogin.setOnClickListener {
            // Inicia a activity Login
            startActivity(Intent(requireContext(), Login::class.java))
        }

        val btnRegisterAssistances = binding.btnRegisterAssistance
        btnRegisterAssistances.setOnClickListener {
            startActivity(Intent(requireContext(), AssistancesLogin::class.java))

        }

        // Inicializa o Firebase Auth
        mAuth = FirebaseAuth.getInstance()

        // Localiza as views
        binding.btnSair.setOnClickListener {
            mAuth.signOut()
            updateUI(null)
        }



        return binding.root
    }

    override fun onStart() {
        super.onStart()

        // Verifica se o usuário está logado
        val currentUser = mAuth.currentUser

        // Atualiza a interface do usuário de acordo
        updateUI(currentUser)
    }

    private fun updateUI(user: FirebaseUser?) {
        if (user != null) {
            // Exibe os dados do usuário
            binding.btnSair.visibility = View.VISIBLE
            binding.userEmail.text = user.email

            // Esconde os botões de entrar e cadastrar
            binding.btnEntrar.visibility = View.GONE
        } else {
            // Exibe botões de entrar e cadastrar
            binding.btnEntrar.visibility = View.VISIBLE

            // Esconde os dados do usuário
            binding.btnSair.visibility = View.GONE
            binding.userEmail.text = "Olá, estamos muito felizes que você está por aqui! "
        }
    }
}
