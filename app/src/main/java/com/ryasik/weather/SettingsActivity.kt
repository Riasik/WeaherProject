package com.ryasik.weather

import android.app.ActionBar
import android.app.Activity
import android.os.Bundle


class SettingsActivity: Activity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        ActionBar.DISPLAY_HOME_AS_UP

    }

}