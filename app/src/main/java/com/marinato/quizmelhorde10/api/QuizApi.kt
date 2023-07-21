package com.marinato.quizmelhorde10.api

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface QuizApi {

    @GET("/question")
    fun getQuestion(param: Call<QuestionResponse>): Call<QuestionResponse>

    @POST("/answer")
    fun saveAnswer(@Body request: AnswerRequest,
                   @Query("questionId") questionId: Int) : Call<Boolean>

}
