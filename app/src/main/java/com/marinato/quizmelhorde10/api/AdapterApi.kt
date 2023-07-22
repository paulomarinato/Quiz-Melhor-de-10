package com.marinato.quizmelhorde10.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object AdapterApi {

    private val retrofir = Retrofit.Builder()
        .baseUrl("https://quiz-api-bwi5hjqyaq-uc.a.run.app/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val QuizApi = retrofir.create(QuizApi::class.java)
}