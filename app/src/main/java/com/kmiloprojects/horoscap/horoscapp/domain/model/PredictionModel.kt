package com.kmiloprojects.horoscap.horoscapp.domain.model

import com.google.gson.annotations.SerializedName

data class PredictionModel (
     val date:String,
     val horoscope:String,
     val sign:String
)