package com.tugcearas.customnavigationbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tugcearas.customnavigationbar.databinding.ActivityFourthScreenBinding

class FourthScreen : AppCompatActivity() {

    private lateinit var binding: ActivityFourthScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityFourthScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.fourthNavigationView.background = null
        click()
    }

    private fun click(){
        binding.fourthButton.setOnClickListener {
            startActivity(Intent(this,FifthScreen::class.java))
        }
    }
}