package com.marinato.quizmelhorde10.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.marinato.quizmelhorde10.api.AdapterApi
import com.marinato.quizmelhorde10.databinding.ActivityQuestionsBinding
import com.marinato.quizmelhorde10.model.Questions
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

        questionsPost.enqueue(object : Callback<Questions> {
            override fun onResponse(call: Call<Questions>, response: Response<Questions>) {
                /*binding.text_question.text = response.body().toString()*/
                Toast.makeText(this@QuestionsActivity,response.body().toString(),Toast.LENGTH_SHORT)
                    .show()}

            override fun onFailure(call: Call<Questions>, t: Throwable) {
                Toast.makeText(
                    this@QuestionsActivity,
                    "Falha ao Consultar a API",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })
    }
}







