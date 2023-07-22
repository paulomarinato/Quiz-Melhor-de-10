package com.marinato.quizmelhorde10.api

import com.marinato.quizmelhorde10.model.Questions
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface QuizApi {

    @GET("/question")
    fun getQuestion(): Call<Questions>
    @POST("/answer")
    fun saveAnswer(@Query("questionId") questionId: Int) : Call<Boolean>

}
