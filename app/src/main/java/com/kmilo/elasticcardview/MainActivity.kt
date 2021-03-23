package com.kmilo.elasticcardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import com.kmilo.elasticcardview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        binding.button1.setOnClickListener {
            Toast.makeText(applicationContext, "Button pressed", Toast.LENGTH_SHORT).show()
        }

        binding.elasticCard.setOnClickListener {
            Toast.makeText(applicationContext, "CardView pressed", Toast.LENGTH_SHORT).show()
        }
    }
}