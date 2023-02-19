package com.example.clickon.DiagnosticPhone

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.clickon.R

class DiagnosticBrokenScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modelphone)
        supportActionBar?.hide()

        val suggestions = listOf(
            "(Apple) Iphone 11", "(Apple) Iphone 12", "(Apple) Iphone 13", "(Apple) Iphone 14",
            "(Apple) Iphone 7", "(Apple) Iphone 8", "(Apple) Iphone 6", "(SAMSUNG) Galaxy A10",
            "(SAMSUNG) Galaxy A11", "(SAMSUNG) Galaxy A12", "(SAMSUNG) Galaxy A20", "(SAMSUNG) Galaxy A30",
            "(SAMSUNG) Galaxy A50", "(SAMSUNG) Galaxy A51", "(SAMSUNG) Galaxy A70"
        )

        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, suggestions)
        val autoCompleteTextView = findViewById<AutoCompleteTextView>(R.id.button_search_phones)
        autoCompleteTextView.setAdapter(adapter)

        val buttonBack = findViewById<Button>(R.id.button_back)
        buttonBack.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        finish()
    }
}