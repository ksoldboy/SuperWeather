package com.kotlin.superweather.logic

import androidx.lifecycle.liveData
import com.kotlin.superweather.logic.model.Place
import com.kotlin.superweather.logic.network.SuperWeatherNetwork
import kotlinx.coroutines.Dispatchers

/**
 * @Author: ksoldboy
 * @Date: 2020/12/8 0008 17:11
 * @Description:
 *
 */
object Repository {

    fun searchPlaces(query: String) = liveData(Dispatchers.IO) {
        val result = try {
            val placeResponse = SuperWeatherNetwork.searchPlaces(query)
            if (placeResponse.status == "ok"){
                val places = placeResponse.places
                Result.success(places)
            }else{
                Result.failure(RuntimeException("response status is ${placeResponse.status}"))
            }
        }catch (e:Exception){
            Result.failure<List<Place>>(e)
        }
        emit(result)
    }

}