package com.ryasik.weather.Model.OpenWeatherMap

import com.google.gson.annotations.SerializedName

@Suppress("unused")
class Clouds{
    /**
     *  "clouds":{"all":0},
     */
    @SerializedName("all")
    val all: Double = 0.0
}