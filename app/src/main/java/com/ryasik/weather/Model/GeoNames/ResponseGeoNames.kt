package com.ryasik.weather.Model.GeoNames

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class ResponseGeoNames {

    @SerializedName("totalResultsCount")
    @Expose
    var totalResultsCount: Int? = null
    @SerializedName("geonames")
    @Expose
    var geonames: List<Geoname>? = null

}