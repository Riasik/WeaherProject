package com.ryasik.weather.Model.OpenWeatherMap

import com.google.gson.annotations.SerializedName

@Suppress("unused")
class Weather{
    /** [{"id":800,
     * "main":"Clear",
     * "description":"clear sky",
     * "icon":"01n"}],*/
    @SerializedName("id")
    val id: Int = 0
    @SerializedName("main")
    private val main: String? = null
    @SerializedName("description")
     val description : String? = null
    @SerializedName("icon")
    val icon: String? = null

}