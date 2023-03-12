package com.example.task4.data

import com.google.gson.annotations.SerializedName

data class WeatherResponse(

	@field:SerializedName("request")
	val request: Request? = null,

	@field:SerializedName("current")
	val current: CurrentWeather? = null
)
