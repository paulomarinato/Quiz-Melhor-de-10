package com.marinato.quizmelhorde10.data.repository

import com.marinato.quizmelhorde10.data.model.AnswerRequest
import com.marinato.quizmelhorde10.data.model.QuestionsResponse
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface QuizApi {

    @GET("/question")
    fun getQuestion(): Call<QuestionsResponse>

    companion object {
        private val quizApi: QuizApi by lazy {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://quiz-api-bwi5hjqyaq-uc.a.run.app/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            retrofit.create(QuizApi::class.java)
        }

        fun getInstance(): QuizApi {
            return quizApi
        }
    }

    @POST("/answer")
    fun saveAnswer(
        @Query("questionId") questionId: Int,
        @Body request: AnswerRequest,
    ): Call<Boolean>


}
