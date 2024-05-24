package com.kmiloprojects.horoscap.horoscapp.data.netwok.response

import com.google.gson.annotations.SerializedName
import com.kmiloprojects.horoscap.horoscapp.domain.model.PredictionModel

data class PredictionResponse(
    @SerializedName("date") val date:String,
    @SerializedName("horoscope") val horoscope:String,
    @SerializedName("sign") val sign:String
){
    fun toDomain():PredictionModel{
        return PredictionModel(
            date = date,
            horoscope = horoscope,
            sign = sign
        )
    }
}