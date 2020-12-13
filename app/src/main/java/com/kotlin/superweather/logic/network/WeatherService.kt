package com.kotlin.superweather.logic.network

import android.telecom.Call
import com.kotlin.superweather.SuperWeatherApplication
import com.kotlin.superweather.logic.model.DailyResponse
import com.kotlin.superweather.logic.model.RealtimeResponse
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * @Author: ksoldboy
 * @Date: 2020/12/12 0012 10:51
 * @Description:
 *
 */
interface WeatherService {

    @GET("v2.5/${SuperWeatherApplication.TOKEN}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(@Path("lng") lng: String, @Path("lat") lat: String):
            retrofit2.Call<RealtimeResponse>

    @GET("v2.5/${SuperWeatherApplication.TOKEN}/{lng},{lat}/daily.json")
    fun getDailyWeather(@Path("lng") lng: String, @Path("lat") lat: String):
            retrofit2.Call<DailyResponse>

}