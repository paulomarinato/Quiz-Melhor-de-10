package com.marinato.quizmelhorde10.data.repository

import com.marinato.quizmelhorde10.data.model.AnswerRequest

class QuestionRepository constructor(private val quizApi: QuizApi) {

    fun getAllQuestions() = quizApi.getQuestion()

    fun getSaveAnswer() = quizApi.saveAnswer(questionId = Int, AnswerRequest(String()))

}