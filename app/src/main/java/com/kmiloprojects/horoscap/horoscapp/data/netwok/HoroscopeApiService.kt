package com.kmiloprojects.horoscap.horoscapp.data.netwok

import com.kmiloprojects.horoscap.horoscapp.data.netwok.response.PredictionResponse
import retrofit2.http.*

interface HoroscopeApiService {

    @GET("/{sign}")
    suspend fun getHoroscope(@Path("sign") sign: String): PredictionResponse?

}