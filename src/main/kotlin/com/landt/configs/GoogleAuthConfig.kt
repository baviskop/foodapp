package com.landt.configs


object GoogleAuthConfig {
    val clientId = "168696425569-sep0m5tq7s766n95d76m9tosdvscj4sa.apps.googleusercontent.com"
    val clientSecret = " your google client secret"
    const val redirectUri = "http://localhost:8080/auth/google/callback"
    const val authorizeUrl = "https://accounts.google.com/o/oauth2/auth"
    const val tokenUrl = "https://oauth2.googleapis.com/token"
}