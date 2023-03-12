package com.example.task4.data

import com.google.gson.annotations.SerializedName

data class CurrentWeather(

    @field:SerializedName("temperature")
    val temperature: Int? = null
)