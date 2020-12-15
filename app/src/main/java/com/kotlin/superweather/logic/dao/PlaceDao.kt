package com.kotlin.superweather.logic.dao

import android.content.Context
import android.provider.Settings.Global.putString
import androidx.core.content.edit
import com.google.gson.Gson
import com.kotlin.superweather.SuperWeatherApplication
import com.kotlin.superweather.logic.model.Place

/**
 * @Author: ksoldboy
 * @Date: 2020/12/15 0015 10:57
 * @Description:
 *
 */
object PlaceDao {

    fun savePlace(place:Place){
        sharedPreferences().edit{
            putString("place",Gson().toJson(place))
        }
    }

    fun getSavedPlace():Place{
        val placeJson = sharedPreferences().getString("place","")
        return Gson().fromJson(placeJson,Place::class.java)
    }

    fun isPlaceSaved() = sharedPreferences().contains("place")

    private fun sharedPreferences() = SuperWeatherApplication.context.
            getSharedPreferences("super_weather", Context.MODE_PRIVATE)

}