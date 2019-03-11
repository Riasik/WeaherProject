package com.ryasik.weather.Rest

import com.ryasik.weather.Model.ApiResponse
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RestAPI {
    private val buriApi: IApi
    private val API_KEY  = "af8b892c80a3fe0ebc3ac11faddf4b85";

    init {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://api.openweathermap.org/")
            .build()

        buriApi = retrofit.create(IApi::class.java)
    }

    fun getWeatherList(token: String): Call<ApiResponse> {
        return buriApi.getWeather("metric",token,API_KEY)
    }
}