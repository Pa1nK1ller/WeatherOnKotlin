package com.example.weatheronkotlin.repository

import com.example.weatheronkotlin.model.Weather

interface MainRepository {
    fun getWeatherFromServer(): Weather
    fun getWeatherFromLocalStorageRus(): List<Weather>
    fun getWeatherFromLocalStorageWorld(): List<Weather>
}