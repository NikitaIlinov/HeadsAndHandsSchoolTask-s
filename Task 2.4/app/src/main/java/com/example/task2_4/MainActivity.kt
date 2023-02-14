package com.example.task2_4

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textViewActivity)
        textView.movementMethod = ScrollingMovementMethod()

        textView.append("\nonCreate")

        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<ExampleFragment>(R.id.frameLayout)
        }
        //Log.i("Activity", "onCreate")
    }


    override fun onStart() {
        super.onStart()
        textView.append("\nonStart")
        Log.i("Activity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        textView.append("\nonResume")
        Log.i("Activity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        textView.append("\nonPause")
        Log.i("Activity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        textView.append("\nonStop")
        Log.i("Activity", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        textView.append("\nonRestart")
        Log.i("Activity", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        textView.append("\nonDestroy")
        Log.i("Activity", "onDestroy")
    }
}