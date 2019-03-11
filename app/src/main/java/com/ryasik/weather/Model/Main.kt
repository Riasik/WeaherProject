package com.ryasik.weather.Model

import com.google.gson.annotations.SerializedName

@Suppress("unused")
class Main{
    /**
     * {"temp":279.15,
     * "pressure":1012,
     * "humidity":87,
     * "temp_min":279.15,
     * "temp_max":279.15},
     */
    @SerializedName("temp")
    val temp: Double = 0.0
    @SerializedName("pressure")
    val pressure: Double = 0.0
    @SerializedName("humidity")
    val humidity: Double = 0.0
    @SerializedName("temp_min")
    val temp_min: Double = 0.0
    @SerializedName("temp_max")
    val temp_max: Double = 0.0

}