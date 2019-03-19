package com.ryasik.weather

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager

class PrefsManager private constructor(context: Context) {
    private val prefs: SharedPreferences


     var tempUnit: String = "metric"

    init {
        prefs = PreferenceManager.getDefaultSharedPreferences(context)
    }


    companion object {

        private val TAG = PrefsManager::class.java.simpleName

        fun from(context: Context): PrefsManager {
            return PrefsManager(context)
        }
    }
}