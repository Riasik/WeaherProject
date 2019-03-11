package com.ryasik.weather.Model

import com.google.gson.annotations.SerializedName

class Wind{
    /**
     * {"speed":2.01,
     * "deg":182.004},
     */
    @SerializedName("speed")
    val speed: Double = 0.0
    @SerializedName("deg")
    val deg: Double = 0.0
}