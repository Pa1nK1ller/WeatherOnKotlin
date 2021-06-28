package com.example.weatheronkotlin.repository

import com.example.weatheronkotlin.model.Weather
import com.example.weatheronkotlin.model.getRussianCities
import com.example.weatheronkotlin.model.getWorldCities

class MainRepositoryImpl : MainRepository {

    override fun getWeatherFromServer() =
        Weather()

    override fun getWeatherFromLocalStorageRus() =
        getRussianCities()

    override fun getWeatherFromLocalStorageWorld() =
        getWorldCities()
}