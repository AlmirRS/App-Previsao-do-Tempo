package com.example.previsodotempo.services

import com.example.previsodotempo.model.Main
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

//https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}
//3fed5fe89150d0ad58a2dd9a105af3c3

interface Api {
    @GET("weather?")

    fun weatherMap(
        @Query("q") cityName: String,
        @Query("appid") api_key: String
    ): Call<Main>
}