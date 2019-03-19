package com.ryasik.weather

import android.app.SearchManager
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.view.MenuItemCompat
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.SearchView
import android.view.Menu
import android.view.MenuItem
import com.ryasik.weather.Model.OpenWeatherMap.ApiResponse
import com.ryasik.weather.Rest.RestAPI
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*

class MainActivity : AppCompatActivity(), SearchView.OnQueryTextListener{


    private val api: RestAPI = RestAPI()
    private lateinit var timeUpdate:Date
    private var prefs: PrefsManager? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        update.setOnClickListener {
            prefs = PrefsManager.from(this)
            timeUpdate = Calendar.getInstance().getTime()
            val api = api.getWeatherList("dnipro")
            api.enqueue(object: Callback<ApiResponse> {
                override fun onFailure(call: Call<ApiResponse>, t: Throwable) {
                    println("Failed to execute request")
                    t.printStackTrace()
                }

                override fun onResponse(call: Call<ApiResponse>, response: Response<ApiResponse>) {
                    holder(response.body()!!)
                }
            })

        }
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        val searchItem = menu.findItem(R.id.search)
        val searchView = MenuItemCompat.getActionView(searchItem) as SearchView
        searchView.setOnQueryTextListener(this)
        val searchManager = getSystemService(Context.SEARCH_SERVICE) as SearchManager
        searchView.setSearchableInfo(searchManager.getSearchableInfo(
            ComponentName(this, MainActivity::class.java)
        ))
        searchView.setIconifiedByDefault(false)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> {
                val intent = Intent(this, SettingsActivity::class.java)
//                intent.putExtra("key", value)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
    fun holder(response: ApiResponse){
        tv_city_screen.text = response.cityName
        tv_condition_screen.text = response.weather!![0].description.toString()
        tv_temperature_screen.text = (response.main?.temp.toString()+ "°C")
        tv_temperature_max_screen.text = (response.main?.temp_max.toString()+ "°C")
        tv_temperature_min_screen.text = (response.main?.temp_min.toString()+ "°C")
        tv_pressure_screen.text = (response.main?.pressure.toString() +" hPa")
        tv_humidity_screen.text = (response.main?.humidity.toString() +"%")
        tv_speed_screen.text = (response.wind?.speed.toString() +" meter/sec")
//        tv_direction_screen.text = response.

        tv_time_update_screen.text = timeUpdate.toString()
    }

    override fun onQueryTextSubmit(query:String):Boolean {
        // User pressed the searchable button
        return false
    }
    override fun onQueryTextChange(newText:String):Boolean {
        // User changed the text
        return false
    }

}

