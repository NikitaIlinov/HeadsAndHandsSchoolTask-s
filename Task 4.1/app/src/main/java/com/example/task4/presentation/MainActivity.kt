package com.example.task4.presentation

import android.annotation.SuppressLint
import android.content.Context
import android.net.ConnectivityManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.task4.databinding.ActivityMainBinding
import com.example.task4.domain.ApiInterface
import com.example.task4.domain.RetrofitClient
import com.google.android.gms.location.*
import kotlinx.coroutines.*
import java.util.*


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener {
            CoroutineScope(Dispatchers.IO).launch {

                if (isNetworkAvailable())
                    weatherApi(binding.editTextTextPostalAddress.text.toString())
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private suspend fun weatherApi(name: String) {

        val client: ApiInterface = RetrofitClient.service
        val weatherResponse = client.getCurrentWeatherAsync(name).await()

        withContext(Dispatchers.Main) {
            with(binding) {
                    textView.text = weatherResponse.current?.temperature.toString() + "°"
                }
            }
        }


    private fun isNetworkAvailable(): Boolean {
        val connectivityManager =
            getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetworkInfo = connectivityManager.activeNetworkInfo
        return (activeNetworkInfo != null) && activeNetworkInfo.isConnected
    }
}