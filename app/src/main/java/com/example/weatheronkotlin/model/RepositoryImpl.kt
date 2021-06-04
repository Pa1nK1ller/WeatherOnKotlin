package com.example.weatheronkotlin.model

import com.example.weatheronkotlin.model.Repository
import com.example.weatheronkotlin.model.Weather

class RepositoryImpl : Repository {

    override fun getWeatherFromServer(): Weather {
        return Weather()
    }

    override fun getWeatherFromLocalStorage(): Weather {
        return Weather()
    }
}
