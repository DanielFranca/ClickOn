package com.example.clickon.Cards.CardsPhone

import PhoneDetailsFragmentScreen
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.clickon.R

class PhoneCards : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.phonecardsdetails)

        val phoneModel = intent.getStringExtra(getString(R.string.phone_model)) ?: ""
        val bundle = Bundle()
        bundle.putString(getString(R.string.phone_model), phoneModel)

        val fragment = PhoneDetailsFragmentScreen()
        fragment.arguments = bundle

        supportFragmentManager.beginTransaction()
            .replace(R.id.phonedetailscards, fragment)
            .commit()
    }
}