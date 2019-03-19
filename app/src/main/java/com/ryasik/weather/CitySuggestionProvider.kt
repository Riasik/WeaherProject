package com.ryasik.weather

import android.app.SearchManager
import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.database.MatrixCursor
import android.net.Uri
import android.provider.BaseColumns
import okhttp3.OkHttpClient
import okhttp3.Request
import org.json.JSONArray

class CitySuggestionProvider: ContentProvider() {
    override fun insert(p0: Uri, p1: ContentValues?): Uri? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun update(p0: Uri, p1: ContentValues?, p2: String?, p3: Array<String>?): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(p0: Uri, p1: String?, p2: Array<String>?): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getType(p0: Uri): String? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    lateinit var cities:List<String>

    override fun onCreate():Boolean {
        return false
    }
    override fun query(uri:Uri, projection:Array<String>, selection:String,
                       selectionArgs:Array<String>, sortOrder:String): Cursor {
        if (cities.isEmpty())
        {
            val client = OkHttpClient()
            val request = Request.Builder()
                .url("http://api.geonames.org/searchJSON?q=dnipro&maxRows=10&username=ryasik")
                .build()
            try
            {
                val response = client.newCall(request).execute()
                val jsonString = response.body()!!.string()
                val jsonArray = JSONArray(jsonString)
                cities = ArrayList<String>()
                val lenght = jsonArray.length()
                for (i in 0 until lenght)
                {
                    val city = jsonArray.getString(i)
                    (cities as ArrayList<String>).add(city)
                }
            }
            catch (e:Exception) {
                e.printStackTrace()
            }
        }
        val cursor = MatrixCursor(
            arrayOf<String>(BaseColumns._ID, SearchManager.SUGGEST_COLUMN_TEXT_1, SearchManager.SUGGEST_COLUMN_INTENT_DATA_ID)
        )
//        if (cities != null)
//        {
//            val query = uri.lastPathSegment.toUpperCase()
//            val limit = Integer.parseInt(uri.getQueryParameter(SearchManager.SUGGEST_PARAMETER_LIMIT))
//            val lenght = cities.size
//            var i = 0
//            while (i < lenght && cursor.getCount() < limit)
//            {
//                val city = cities.get(i)
//                if (city.toUpperCase().contains(query))
//                {
//                    cursor.addRow(arrayOf<Any>(i, city, i))
//                }
//                i++
//            }
//        }
        return cursor
    }
}