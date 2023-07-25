package com.marinato.quizmelhorde10.data.model.Adapter

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object AdapterApi {

    private val retrofir = Retrofit.Builder()
        .baseUrl("https://quiz-api-bwi5hjqyaq-uc.a.run.app/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val QuizApi = retrofir.create(com.marinato.quizmelhorde10.data.repository.QuizApi::class.java)

    private val response = Retrofit.Builder()
        .baseUrl("https://quiz-api-bwi5hjqyaq-uc.a.run.app/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val QuizApiResponse = retrofir.create(com.marinato.quizmelhorde10.data.repository.QuizApi::class.java)


}