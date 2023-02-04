package com.example.task3

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.task3.R.id.*

class HelloActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

        val name = intent.getStringExtra("name")
        val helloText = findViewById<TextView>(textview)
        helloText.text = "Привет, $name!"
    }
}