package com.ryasik.weather.Model.OpenWeatherMap

import com.google.gson.annotations.SerializedName

@Suppress("unused")
class Sys{
    /**
     * {"type":1,
     * "id":8901,
     * "message":0.0073,
     * "country":"UA",
     * "sunrise":1552104283,
     * "sunset":1552145794},
     */

    @SerializedName("type")
    val type: Int = 0
    @SerializedName("id")
    val id: Int = 0
    @SerializedName("message")
    val message: Double = 0.0
    @SerializedName("country")
    private val country: String? = null
    @SerializedName("sunrise")
    val sunrise: Int = 0
    @SerializedName("sunset")
    val sunset: Int = 0
}