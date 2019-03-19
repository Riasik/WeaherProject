package com.ryasik.weather.Rest

import com.ryasik.weather.Model.GeoNames.ResponseGeoNames
import com.ryasik.weather.Model.OpenWeatherMap.ApiResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface IApi{

    @GET("data/2.5/weather")
    fun getWeather(@Query("units") units: String,
                   @Query("q") query: String,
                   @Query("appid") appid: String): Call<ApiResponse>
    @GET("http://api.geonames.org/searchJSON")
    fun getNamesCities(@Query("q") query: String,
                 @Query("maxRows") maxRows: String,
                 @Query("username") username: String): Call<ResponseGeoNames>
}