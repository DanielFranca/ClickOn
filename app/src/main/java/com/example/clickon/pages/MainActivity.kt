package com.example.clickon.pages

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.clickon.R

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var textDevice: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        textView = findViewById(R.id.logo_products)
        textDevice = findViewById(R.id.text_device)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, ProductsActivity::class.java))
        }, 3000)


    }
}


