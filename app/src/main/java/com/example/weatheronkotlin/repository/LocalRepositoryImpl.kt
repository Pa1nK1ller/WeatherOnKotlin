package com.example.weatheronkotlin.repository

import com.example.weatheronkotlin.model.Weather
import com.example.weatheronkotlin.room.HistoryDao
import com.example.weatheronkotlin.utils.convertHistoryEntityToWeather
import com.example.weatheronkotlin.utils.convertWeatherToEntity

class LocalRepositoryImpl(private val localDataSource: HistoryDao) :
    LocalRepository {

    override fun getAllHistory(): List<Weather> {
        return convertHistoryEntityToWeather(localDataSource.all())
    }

    override fun saveEntity(weather: Weather) {
        localDataSource.insert(convertWeatherToEntity(weather))
    }
}