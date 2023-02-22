package com.example.clickon.DiagnosticGeral

import PhoneDetailsFragmentScreen
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.clickon.R

class PhoneDetailsActivityScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_phonedetails_screen)

        val phoneModel = intent.getStringExtra(getString(R.string.phone_model)) ?: ""
        val bundle = Bundle()
        bundle.putString(getString(R.string.phone_model), phoneModel)

        val fragment = PhoneDetailsFragmentScreen()
        fragment.arguments = bundle

        supportFragmentManager.beginTransaction()
            .replace(R.id.container_detailsphone, fragment)
            .commit()
    }
}