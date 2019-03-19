package com.ryasik.weather.Model.GeoNames

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Geoname {

    @SerializedName("adminCode1")
    @Expose
    var adminCode1: String? = null
    @SerializedName("lng")
    @Expose
    var lng: String? = null
    @SerializedName("geonameId")
    @Expose
    var geonameId: Int? = null
    @SerializedName("toponymName")
    @Expose
    var toponymName: String? = null
    @SerializedName("countryId")
    @Expose
    var countryId: String? = null
    @SerializedName("fcl")
    @Expose
    var fcl: String? = null
    @SerializedName("population")
    @Expose
    var population: Int? = null
    @SerializedName("countryCode")
    @Expose
    var countryCode: String? = null
    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("fclName")
    @Expose
    var fclName: String? = null
    @SerializedName("adminCodes1")
    @Expose
    var adminCodes1: AdminCodes1? = null
    @SerializedName("countryName")
    @Expose
    var countryName: String? = null
    @SerializedName("fcodeName")
    @Expose
    var fcodeName: String? = null
    @SerializedName("adminName1")
    @Expose
    var adminName1: String? = null
    @SerializedName("lat")
    @Expose
    var lat: String? = null
    @SerializedName("fcode")
    @Expose
    var fcode: String? = null

}