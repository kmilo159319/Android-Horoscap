package com.kmiloprojects.horoscap.horoscapp.data.provider

import com.kmiloprojects.horoscap.horoscapp.domain.model.HoroscopeInfo
import com.kmiloprojects.horoscap.horoscapp.domain.model.HoroscopeInfo.*
import javax.inject.Inject

class HoroscopeProviders @Inject constructor() {
    fun getHoroscopes(): List<HoroscopeInfo> {
        return listOf(
            Aries,
            Taurus,
            Geminis,
            Cancer,
            Leo,
            Virgo,
            Libra,
            Scorpio,
            Sagittarius,
            Capricorn,
            Aquarius,
            Pisces
        )
    }
}