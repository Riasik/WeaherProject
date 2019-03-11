package com.ryasik.weather.Model

import com.google.gson.annotations.SerializedName

@Suppress("unused")
class Clouds{
    /**
     *  "clouds":{"all":0},
     */
    @SerializedName("all")
    val all: Double = 0.0
}