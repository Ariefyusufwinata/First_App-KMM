package com.rief.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rief.Greeting
import android.widget.TextView
import com.rief.android.databinding.ActivityMainBinding

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView.text = greet()
    }
}
