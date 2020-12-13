package com.kotlin.superweather.logic.model

import com.google.gson.annotations.SerializedName

/**
 * @Author: ksoldboy
 * @Date: 2020/12/11 0011 20:48
 * @Description:
 *
 */
data class RealtimeResponse(val status: String, val result: Result) {

    data class Result(val realtime: Realtime)

    data class Realtime(
        val skycon: String, val temperature: Float,
        @SerializedName("air_quality") val airQuality: AirQuality
    )

    data class AirQuality(val aqi: AQI)

    data class AQI(val chn: Float)

}