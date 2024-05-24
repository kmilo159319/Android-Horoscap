package com.kmiloprojects.horoscap.horoscapp.domain.usecase

import com.kmiloprojects.horoscap.horoscapp.domain.Repository
import javax.inject.Inject

class GetPredictionUseCase @Inject constructor(private val repository: Repository) {
    suspend operator fun invoke(sign:String) = repository.getPrediction(sign)
}