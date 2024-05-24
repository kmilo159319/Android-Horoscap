package com.kmiloprojects.horoscap.horoscapp.data.netwok

import android.speech.tts.UtteranceProgressListener
import com.kmiloprojects.horoscap.BuildConfig.BASE_URL
import com.kmiloprojects.horoscap.horoscapp.data.RepositoryImpl
import com.kmiloprojects.horoscap.horoscapp.data.core.interceptors.AuthInterceptor
import com.kmiloprojects.horoscap.horoscapp.domain.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideRetrofit(okhttpClient:OkHttpClient): Retrofit {
        return Retrofit
            .Builder()
            .baseUrl(BASE_URL)
            .client(okhttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(authInterceptor: AuthInterceptor):OkHttpClient{

        val interceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

        return  OkHttpClient
                .Builder()
                .addInterceptor(authInterceptor)
                .build()
    }

    @Provides
    fun providerHoroscopoServide(retrofit: Retrofit):HoroscopeApiService{
        return retrofit.create(HoroscopeApiService::class.java)
    }

    @Provides
    fun provideRepository(apiService: HoroscopeApiService):Repository{
        return  RepositoryImpl(apiService)
    }
}