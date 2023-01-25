package com.tugcearas.customnavigationbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tugcearas.customnavigationbar.databinding.ActivitySixthScreenBinding

class SixthScreen : AppCompatActivity() {

    private lateinit var binding: ActivitySixthScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySixthScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}