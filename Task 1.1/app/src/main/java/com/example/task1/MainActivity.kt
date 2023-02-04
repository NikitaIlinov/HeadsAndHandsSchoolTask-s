package com.example.task1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.homework1.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun red(view: View) {
        val redIntent = Intent(this, RedActivity::class.java)
        startActivity(redIntent)
    }

    fun green(view: View) {
        val greenIntent = Intent(this, GreenActivity::class.java)
        startActivity(greenIntent)
    }

    fun blue(view: View) {
        val blueIntent = Intent(this, BlueActivity::class.java)
        startActivity(blueIntent)
    }


}