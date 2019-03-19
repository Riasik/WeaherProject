package com.ryasik.weather.Model.OpenWeatherMap

import com.google.gson.annotations.SerializedName

@Suppress("unused")
class ApiResponse {
    /**
     * "coord":{"lon":35.04,"lat":48.47},
     * "weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],
     * "base":"stations",
     * "main":{"temp":279.15,"pressure":1012,"humidity":87,"temp_min":279.15,"temp_max":279.15},
     * "visibility":10000,
     * "wind":{"speed":2.01,"deg":182.004},
     * "clouds":{"all":0},
     * "dt":1552159800,
     * "sys":{"type":1,"id":8901,"message":0.0073,"country":"UA","sunrise":1552104283,"sunset":1552145794},
     * "id":709930,
     * "name":"Dnipro",
     * "cod":200
     */

    @SerializedName("coord")
    private val coord: Coord? = null
    @SerializedName("weather")
    val weather: List<Weather>? = null
    @SerializedName("base")
    val base: String? = null
    @SerializedName("main")
     val main: Main? = null
    @SerializedName("visibility")
    private val visibility: Int = 0
    @SerializedName("wind")
     val wind: Wind? = null
    @SerializedName("clouds")
    private val clouds: Clouds? = null
    @SerializedName("dt")
    val dt: Int = 0
    @SerializedName("sys")
    private val sys: Sys? = null
    @SerializedName("id")
    val id: Int = 0
    @SerializedName("name")
    val cityName: String? = null
    @SerializedName("cod")
    val cod: Int = 0

}