package com.marinato.quizmelhorde10.api

import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.GET

interface EndpointApi {
    @GET("https://quiz-api-bwi5hjqyaq-uc.a.run.app/")
    fun getImportarApi() : Call<JsonObject> {}

    @GET("https://quiz-api-bwi5hjqyaq-uc.a.run.app/")
    fun getExecutApi() : Call<JsonObject> {}

}
