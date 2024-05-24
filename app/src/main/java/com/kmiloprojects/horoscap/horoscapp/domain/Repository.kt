package com.kmiloprojects.horoscap.horoscapp.domain

import com.kmiloprojects.horoscap.horoscapp.data.netwok.response.PredictionResponse
import com.kmiloprojects.horoscap.horoscapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sing:String): PredictionModel?
}