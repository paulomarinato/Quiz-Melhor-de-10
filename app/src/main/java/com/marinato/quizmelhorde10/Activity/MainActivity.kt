package com.marinato.quizmelhorde10.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.Toast
import com.marinato.quizmelhorde10.api.AdapterApi
import com.marinato.quizmelhorde10.model.Questions
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActicityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var questionsPost = AdapterApi.QuizApi.getQuestion()

        questionsPost.enqueue(object : Callback<Questions>{
            override fun onResponse(call: Call<Questions>, response: Response<Questions>) {
                binding.text_api.text = response.body().toString()
            }

            override fun onFailure(call: Call<Questions>, t: Throwable) {
                Toast.makeText(this@MainActivity, "Falha ao Consultar a API", Toast.LENGTH_SHORT).show()
            }
        })
    }
}



