package com.example.weatheronkotlin.repository

import com.example.weatheronkotlin.model.Weather

interface LocalRepository {
    fun getAllHistory():List<Weather>
    fun saveEntity(weather: Weather)
}