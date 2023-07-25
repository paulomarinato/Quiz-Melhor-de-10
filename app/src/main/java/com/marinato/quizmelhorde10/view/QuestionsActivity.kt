package com.marinato.quizmelhorde10.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.marinato.quizmelhorde10.data.model.Adapter.AdapterApi
import com.marinato.quizmelhorde10.data.repository.QuestionRepository
import com.marinato.quizmelhorde10.databinding.ActivityQuestionsBinding
import com.marinato.quizmelhorde10.viewModel.QuestionViewModel

class QuestionsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuestionsBinding
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

    private fun setObservers() {

        viewModel.questionList.observe(this) { it ->
            binding.textQuestion.text = it.statement
            binding.recyclerOptions.layoutManager = LinearLayoutManager(this)
            binding.recyclerOptions.adapter = RadioButtonAdapter(this, it.options, 0) {
                Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
            }
        }

        viewModel.errorMessage.observe(this) {
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()

        }
    }
}









