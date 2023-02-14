package com.example.task2_2

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                add(R.id.fragment_container_view, NumberFragment.newInstance("1"))
            }
        }

        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)

        buttonClicker(button1, "1")
        buttonClicker(button2, "2")
        buttonClicker(button3, "3")

    }

    private fun buttonClicker(button: Button, string: String) {
        button.setOnClickListener {
            supportFragmentManager.commit {
                replace(
                    R.id.fragment_container_view,
                    NumberFragment.newInstance(string)
                )
            }
        }
    }
}