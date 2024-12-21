package com.example.composefeaturestructure.features.login.data

import com.example.composefeaturestructure.features.login.domain.LoginRequest
import com.example.composefeaturestructure.features.login.domain.LoginResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginApiService {

    @POST("auth/login")
    suspend fun login(@Body loginRequest: LoginRequest): LoginResponse
}