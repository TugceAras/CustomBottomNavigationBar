package com.tugcearas.customnavigationbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tugcearas.customnavigationbar.databinding.ActivityThirdScreenBinding

class ThirdScreen : AppCompatActivity() {

    private lateinit var binding: ActivityThirdScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.thirdNavigationView.background = null
        click()
    }

    private fun click(){
        binding.thirdButton.setOnClickListener {
            startActivity(Intent(this,FourthScreen::class.java))
        }
    }
}