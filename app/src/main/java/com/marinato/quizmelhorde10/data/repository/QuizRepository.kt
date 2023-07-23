package com.marinato.quizmelhorde10.data.repository

import com.marinato.quizmelhorde10.data.model.AnswerRequest
import com.marinato.quizmelhorde10.data.model.QuestionsResponse
import retrofit2.Call

interface QuizRepository {
    fun getQuestion(): Call<QuestionsResponse>
    fun saveAnswer(questionId: Int, request: AnswerRequest): Call<Boolean>
}