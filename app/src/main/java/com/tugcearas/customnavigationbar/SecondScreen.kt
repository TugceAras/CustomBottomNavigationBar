package com.tugcearas.customnavigationbar

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tugcearas.customnavigationbar.databinding.ActivitySecondScreenBinding

class SecondScreen : AppCompatActivity() {

    private lateinit var binding:ActivitySecondScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.secondNavigationView.background = null // this code removes transparent in navigation view
        click()
    }

    private fun click(){
        binding.secondScreenButton.setOnClickListener {
            startActivity(Intent(this,ThirdScreen::class.java))
        }
    }
}