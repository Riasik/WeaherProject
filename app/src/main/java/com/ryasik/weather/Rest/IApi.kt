package com.ryasik.weather.Rest

import com.ryasik.weather.Model.ApiResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface IApi{

    @GET("data/2.5/weather")
    fun getWeather(@Query("units") units: String,
                   @Query("q") query: String,
                   @Query("appid") appid: String): Call<ApiResponse>
}