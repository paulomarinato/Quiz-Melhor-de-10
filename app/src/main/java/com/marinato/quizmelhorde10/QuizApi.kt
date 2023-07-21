package com.marinato.quizmelhorde10

import com.marinato.quizmelhorde10.model.AnswerRequest
import com.marinato.quizmelhorde10.model.Questions
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface QuizApi {


    @GET("/question")
    fun getQuestion(param: Call<Questions>): Call<Questions>
    @POST("/answer")
    fun saveAnswer(@Body request: AnswerRequest,
                   @Query("questionId") questionId: Int) : Call<Boolean>
    @DELETE("/delete")
    fun deleteUser(@Query("questionId") questionId: Int) : Call<Boolean>

}
