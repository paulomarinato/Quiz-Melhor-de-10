package com.marinato.quizmelhorde10.view

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.marinato.quizmelhorde10.data.model.Adapter.AdapterApi
import com.marinato.quizmelhorde10.data.repository.QuestionRepository
import com.marinato.quizmelhorde10.databinding.ActivityQuestionsBinding
import com.marinato.quizmelhorde10.viewModel.QuestionViewModel

class QuestionsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuestionsBinding
    private var idQuestion : Int? = null
    lateinit var viewModel: QuestionViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = QuestionViewModel(QuestionRepository(AdapterApi.QuizApi))

    }

    override fun onResume() {
        super.onResume()

        setObservers()
        viewModel.getAllQuestions()
    }
    fun setObservers() {

        viewModel.questionList.observe(this) { it ->
            with(binding) {
                textQuestion.text = it.statement
                recyclerOptions.layoutManager = LinearLayoutManager(this@QuestionsActivity)
                recyclerOptions.adapter = RadioButtonAdapter(this@QuestionsActivity, it, 0) {
                    idQuestion = it
                }
                buttonSubmit.setOnClickListener {
                    Toast.makeText(this@QuestionsActivity, idQuestion.toString(), Toast.LENGTH_SHORT).show()
                }
            }
        }

        viewModel.errorMessage.observe(this) {
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()

        }
    }
}









