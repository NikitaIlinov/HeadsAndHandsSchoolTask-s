package com.example.task4.domain

import com.example.task4.data.WeatherResponse
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query



interface ApiInterface {

    @GET("current")
    fun getCurrentWeatherAsync(@Query("query") mLocation: String ): Deferred <WeatherResponse>

}