package com.marinato.quizmelhorde10

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class AdapterApi {
    companion object {
        fun InstanceRetrofit(path: String) : Retrofit {
            return Retrofit.Builder()
                .baseUrl("https://quiz-api-bwi5hjqyaq-uc.a.run.app/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}