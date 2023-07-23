package com.marinato.quizmelhorde10.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.marinato.quizmelhorde10.data.AdapterApi
import com.marinato.quizmelhorde10.databinding.ActivityQuestionsBinding
import com.marinato.quizmelhorde10.data.model.QuestionsResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class QuestionsActivity : AppCompatActivity() {

    lateinit var binding: ActivityQuestionsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val questionsPost = AdapterApi.QuizApi.getQuestion()

        questionsPost.enqueue(object : Callback<QuestionsResponse> {
            override fun onResponse(
                call: Call<QuestionsResponse>,
                response: Response<QuestionsResponse>,
            ) {
                /*binding.text_question.text = response.body().toString()*/
                Toast.makeText(
                    this@QuestionsActivity,
                    response.body().toString(),
                    Toast.LENGTH_SHORT
                )
                    .show()
            }

            fun mostrarResposta() {

            }

            override fun onFailure(call: Call<QuestionsResponse>, t: Throwable) {
                Toast.makeText(
                    this@QuestionsActivity,
                    "Falha ao Consultar a API",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })
    }
}










