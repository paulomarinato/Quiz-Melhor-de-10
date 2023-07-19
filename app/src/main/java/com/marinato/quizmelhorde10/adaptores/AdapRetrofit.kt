package com.marinato.quizmelhorde10.adaptores

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class AdapRetrofit {
    companion object {
        fun InstanceRetrofit(path: String) : Retrofit{
            return Retrofit.Builder()
                .baseUrl(path)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}