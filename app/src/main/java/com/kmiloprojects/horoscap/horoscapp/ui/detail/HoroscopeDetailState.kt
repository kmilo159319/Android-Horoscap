package com.kmiloprojects.horoscap.horoscapp.ui.detail

import com.kmiloprojects.horoscap.horoscapp.domain.model.HoroscopeModel

sealed class HoroscopeDetailState {
    data object Loading:HoroscopeDetailState()
    data class Error(val error:String):HoroscopeDetailState()
    data class Success(val sign:String, val prediction:String, val horoscopeModel: HoroscopeModel):HoroscopeDetailState()
}