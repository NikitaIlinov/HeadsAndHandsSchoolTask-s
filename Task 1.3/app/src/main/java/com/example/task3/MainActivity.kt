package com.example.task3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun initView() {

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {

            val intent = Intent(this, HelloActivity::class.java)
            val name = findViewById<EditText>(R.id.editTextTextPersonName).text.toString()

            if (name != "") {
                intent.putExtra("name", name)
                startActivity(intent)
            } else {
                Toast.makeText(applicationContext, "Вы не ввели имя!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
