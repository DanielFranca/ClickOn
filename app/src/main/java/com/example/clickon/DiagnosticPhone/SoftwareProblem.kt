package com.example.clickon.DiagnosticPhone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.clickon.R

class SoftwareProblem : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modelphone)
        supportActionBar?.hide()
    }
}