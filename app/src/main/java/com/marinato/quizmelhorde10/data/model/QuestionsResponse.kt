package com.marinato.quizmelhorde10.data.model

data class QuestionsResponse(
    var id: Int,
    var statement: String,
    var options: List<String>,
)
