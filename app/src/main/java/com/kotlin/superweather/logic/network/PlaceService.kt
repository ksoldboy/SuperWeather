package com.kotlin.superweather.logic.network

import com.kotlin.superweather.SuperWeatherApplication
import com.kotlin.superweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @Author: ksoldboy
 * @Date: 2020/12/7 0007 18:27
 * @Description:
 *
 */
interface PlaceService {

    @GET("v2/place?token=${SuperWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query:String):Call<PlaceResponse>
}