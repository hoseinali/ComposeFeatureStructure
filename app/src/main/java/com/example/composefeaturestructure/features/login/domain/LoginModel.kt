package com.example.composefeaturestructure.features.login.domain

data class LoginRequest(
    val email: String,
    val password: String
)
data class LoginResponse(
    val token: String,
    val userId: Int,
    val userName: String,
    val email: String,
    val expiresIn: Long
)