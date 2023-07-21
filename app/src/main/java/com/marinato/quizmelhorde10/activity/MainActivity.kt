package com.marinato.quizmelhorde10.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.JsonObject
import com.marinato.quizmelhorde10.R
import com.marinato.quizmelhorde10.adaptores.AdapRetrofit
import com.marinato.quizmelhorde10.api.QuestionResponse
import com.marinato.quizmelhorde10.api.QuizApi
import okhttp3.Request
import okio.Timeout
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getImportarApi()
    }

    fun getImportarApi() {
        val ApiRetrofit = AdapRetrofit.InstanceRetrofit(path = "quiz-api-bwi5hjqyaq-uc.a.run.app")
        val endpoint  = ApiRetrofit.create(QuizApi::class.java)
    }
}
