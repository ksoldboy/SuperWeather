package com.kotlin.superweather.logic.model

/**
 * @Author: ksoldboy
 * @Date: 2020/12/12 0012 10:48
 * @Description:
 *
 */
data class Weather(val realtime: RealtimeResponse.Realtime,val daily: DailyResponse.Daily)