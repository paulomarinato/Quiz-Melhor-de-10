package com.marinato.quizmelhorde10.viewModel

import android.widget.RadioButton
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.marinato.quizmelhorde10.R
import com.marinato.quizmelhorde10.data.model.Adapter.AdapterApi
import com.marinato.quizmelhorde10.data.model.QuestionsResponse
import com.marinato.quizmelhorde10.data.repository.QuestionRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class QuestionViewModel constructor(private val repository: QuestionRepository) : ViewModel() {

    val questionList = MutableLiveData<QuestionsResponse>()
    val errorMessage = MutableLiveData<String>()

    fun getAllQuestions() {
        val questionsPost = AdapterApi.QuizApi.getQuestion()
        questionsPost.enqueue(object : Callback<QuestionsResponse> {
            override fun onResponse(
                call: Call<QuestionsResponse>,
                response: Response<QuestionsResponse>,
            ) {
                questionList.postValue(response.body()!!)
            }

            override fun onFailure(call: Call<QuestionsResponse>, t: Throwable) {
                errorMessage.postValue(t.message)
            }
        })
    }

    fun saveAnswer(questionId : Int) {

    }

}








