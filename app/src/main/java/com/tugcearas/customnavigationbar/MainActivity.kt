package com.tugcearas.customnavigationbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tugcearas.customnavigationbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        click()
    }

    private fun click(){
        binding.mainButton.setOnClickListener {
            startActivity(Intent(this,SecondScreen::class.java))
        }
    }
}