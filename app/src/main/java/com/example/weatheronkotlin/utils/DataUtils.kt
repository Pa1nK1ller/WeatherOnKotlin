package com.example.weatheronkotlin.utils

import com.example.weatheronkotlin.model.FactDTO
import com.example.weatheronkotlin.model.Weather
import com.example.weatheronkotlin.model.WeatherDTO
import com.example.weatheronkotlin.model.getDefaultCity

fun convertDtoToModel(weatherDTO: WeatherDTO): List<Weather> {
    val fact: FactDTO = weatherDTO.fact!!
    return listOf(
        Weather(
            getDefaultCity(),
            fact.temp!!,
            fact.feels_like!!,
            fact.condition!!,
            fact.icon
        )
    )
}