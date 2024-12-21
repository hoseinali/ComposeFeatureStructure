package com.example.composefeaturestructure.features.login.data

import com.example.composefeaturestructure.features.login.domain.LoginRequest
import com.example.composefeaturestructure.features.login.domain.LoginResponse
import javax.inject.Inject

class LoginRepository @Inject constructor(private val api: LoginApiService) {
    suspend fun login(email: String, password: String): LoginResponse {
        val request = LoginRequest(email = email, password = password)
        return api.login(request)
    }
}