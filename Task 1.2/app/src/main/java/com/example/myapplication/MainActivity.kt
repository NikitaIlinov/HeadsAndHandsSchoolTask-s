package com.example.myapplication


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R.id.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        openLink()
        callPhone()
        sendEmail()
        searchPlace()
    }

    private fun openLink() {
        val buttonLink: Button = findViewById(linkButton)

        buttonLink.setOnClickListener {

            try {
                val link = findViewById<EditText>(url).text.toString()
                val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
                startActivity(browserIntent)
            } catch (e: Exception) {
                Toast.makeText(applicationContext, "Ссылка введена неправильно", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }

    private fun callPhone() {
        val buttonCall = findViewById<Button>(buttonCall)

        buttonCall.setOnClickListener {

            val number = findViewById<EditText>(number).text.toString()
            if (number != "") {
                val callIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$number"))
                startActivity(callIntent)
            } else {
                Toast.makeText(applicationContext, "Вы не ввели номер!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun sendEmail() {
        val buttonEmail = findViewById<Button>(buttonEmail)

        buttonEmail.setOnClickListener {

            val email = findViewById<EditText>(email).text.toString()
            if (email != "") {
                val emailIntent = Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:$email"))
                startActivity(emailIntent)
            } else {
                Toast.makeText(applicationContext, "Вы не ввели email!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun searchPlace() {
        val buttonMap = findViewById<Button>(buttonMap)

        buttonMap.setOnClickListener {

            val address = findViewById<EditText>(map).text.toString()
            if (address != "") {
                val mapIntent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:0, 0?q= $address"))
                startActivity(mapIntent)
            } else {
                Toast.makeText(applicationContext, "Вы не ввели координаты!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}