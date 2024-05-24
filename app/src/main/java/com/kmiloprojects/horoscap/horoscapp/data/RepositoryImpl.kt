package com.kmiloprojects.horoscap.horoscapp.data

import android.util.Log
import com.kmiloprojects.horoscap.horoscapp.data.netwok.HoroscopeApiService
import com.kmiloprojects.horoscap.horoscapp.data.netwok.response.PredictionResponse
import com.kmiloprojects.horoscap.horoscapp.domain.Repository
import com.kmiloprojects.horoscap.horoscapp.domain.model.PredictionModel
import retrofit2.Retrofit
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private  val apiService: HoroscopeApiService) : Repository {
    override suspend fun getPrediction(sign: String): PredictionModel? {
        //peticion retrofit
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess {
                if (it != null) {
                    return it.toDomain()
                }
            }
            .onFailure { Log.i("johan", "Ha ocurrido un error: ${it.message}") }
        return null
    }

}