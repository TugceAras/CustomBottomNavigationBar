package com.tugcearas.customnavigationbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tugcearas.customnavigationbar.databinding.ActivityFifthScreenBinding

class FifthScreen : AppCompatActivity() {

    private lateinit var binding: ActivityFifthScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFifthScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        click()
    }

    private fun click(){
        binding.fourthButton.setOnClickListener {
            startActivity(Intent(this,SixthScreen::class.java))
        }
    }
}