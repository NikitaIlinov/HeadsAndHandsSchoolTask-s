package com.example.task2_3

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
                add(R.id.fragment_container_view2, ResultFragment.newInstance("1"))
                add(R.id.fragment_container_view1, ResultFragment.newInstance("A"))
            }
        }

        val buttonA: Button = findViewById(R.id.buttonA)
        val buttonB: Button = findViewById(R.id.buttonB)
        val buttonC: Button = findViewById(R.id.buttonC)

        buttonClicker(buttonA, "A",R.id.fragment_container_view1)
        buttonClicker(buttonB, "B",R.id.fragment_container_view1)
        buttonClicker(buttonC, "C",R.id.fragment_container_view1)

        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)

        buttonClicker(button1, "1",R.id.fragment_container_view2)
        buttonClicker(button2, "2",R.id.fragment_container_view2)
        buttonClicker(button3, "3",R.id.fragment_container_view2)
    }

    private fun buttonClicker(button: Button, string: String,containerViewId: Int) {
        button.setOnClickListener {
            supportFragmentManager.commit {
                replace(
                    containerViewId,
                    ResultFragment.newInstance(string)
                )
            }
        }
    }
}

