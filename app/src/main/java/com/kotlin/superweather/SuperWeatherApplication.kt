package com.kotlin.superweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * @Author: ksoldboy
 * @Date: 2020/12/7 0007 18:17
 * @Description:
 *
 */
class SuperWeatherApplication:Application() {

    companion object{
        const val TOKEN = "K4NHC1dzbAkAnKZe"//彩云天气的API令牌
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}