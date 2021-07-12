package com.example.weatheronkotlin.repository

import com.example.weatheronkotlin.model.WeatherDTO

interface DetailsRepository {
    fun getWeatherDetailsFromServer(
        lat: Double,
        lon: Double,
        callback: retrofit2.Callback<WeatherDTO>
    )
}