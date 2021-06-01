package com.example.kakaologin.Network

import com.example.kakaologin.Model.LoginDTO
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface InfoService {

    @Headers("Content-Type: application/json; charset=UTF-8")
    @POST("/로그인 API")
    abstract fun requestLogin(
        //로그인시 전달 값
        @Body body : JsonObject
    ): Call<LoginDTO>

    @Headers("Content-Type: application/json; charset=UTF-8")
    @POST("/회원가입 API")
    abstract fun requestJoin(
        //회원가입시 전달 값
        @Body body : JsonObject
    ): Call<Unit>
}