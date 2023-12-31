package com.marinato.quizmelhorde10.data.repository

import com.marinato.quizmelhorde10.data.model.QuestionsResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface QuizApi {

    @GET("/question")
    fun getQuestion(): Call<QuestionsResponse>

    @POST("/answer")
    fun saveAnswer(
        @Body
        @Query("questionId") questionId: Int
    ): Call<Boolean>
}
