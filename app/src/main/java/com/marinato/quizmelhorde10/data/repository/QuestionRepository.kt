package com.marinato.quizmelhorde10.data.repository

class QuestionRepository constructor(private val quizApi: QuizApi) {

    fun getAllQuestions() = quizApi.getQuestion()

}