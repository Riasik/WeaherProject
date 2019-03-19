package com.ryasik.weather

import android.app.ActionBar
import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_settings.*


class SettingsActivity: Activity(){
    private var prefs: PrefsManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)


        prefs = PrefsManager.from(this)
        radio_group_units.setOnCheckedChangeListener { _, isChecked ->
            when(isChecked){
                R.id.rb_standart -> prefs!!.tempUnit = "metric"
                R.id.rb_imperial -> prefs!!.tempUnit ="imperial"
                R.id.rb_metric -> prefs!!.tempUnit ="metric"
            }
        }
        ActionBar.DISPLAY_HOME_AS_UP
    }

}