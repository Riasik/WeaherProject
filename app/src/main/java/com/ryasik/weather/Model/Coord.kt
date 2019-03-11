package com.ryasik.weather.Model

import com.google.gson.annotations.SerializedName

@Suppress("unused")
class Coord {
    /**
     * {"lon":35.04,
     * "lat":48.47}
     */
    @SerializedName("lon")
    val lon: Double = 0.0
    @SerializedName("lat")
    val lat: Double = 0.0
}