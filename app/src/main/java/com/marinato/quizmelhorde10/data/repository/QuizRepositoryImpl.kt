package com.marinato.quizmelhorde10.data.repository

import com.marinato.quizmelhorde10.data.model.AnswerRequest
import com.marinato.quizmelhorde10.data.model.QuestionsResponse
import retrofit2.Call

class QuizRepositoryImpl(private val api: QuizApi) : QuizRepository {
    override fun getQuestion(): Call<QuestionsResponse> {
        return api.getQuestion()
    }

    override fun saveAnswer(questionId: Int, request: AnswerRequest): Call<Boolean> {
        return api.saveAnswer(questionId, request)
    }
}