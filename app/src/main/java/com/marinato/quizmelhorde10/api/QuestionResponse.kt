package com.marinato.quizmelhorde10.api

data class QuestionResponse(
    var id: Int,
    var statement: String,
    var options: List<String>
)
