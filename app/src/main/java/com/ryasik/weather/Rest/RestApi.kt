package com.ryasik.weather.Rest

import com.ryasik.weather.Model.GeoNames.ResponseGeoNames
import com.ryasik.weather.Model.OpenWeatherMap.ApiResponse
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RestAPI {
    private val iApi: IApi
    private val API_KEY  = "af8b892c80a3fe0ebc3ac11faddf4b85";

    init {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://api.openweathermap.org/")
            .build()

        iApi = retrofit.create(IApi::class.java)
    }

    fun getWeatherList(token: String): Call<ApiResponse> {
        return iApi.getWeather("metric",token,API_KEY)
    }
    fun getCitiesList(q: String): Call<ResponseGeoNames> {
        return iApi.getNamesCities(q,"10","ryasik")
    }

}