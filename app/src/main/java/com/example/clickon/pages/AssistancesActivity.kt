package com.example.clickon.pages

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.clickon.databinding.ActivityAssistancesBinding

class AssistancesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAssistancesBinding

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = com.example.clickon.databinding.ActivityAssistancesBinding.inflate(layoutInflater)
            setContentView(binding.root)




        }
    }
