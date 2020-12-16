package com.joydeep.data.api

import com.joydeep.domain.entity.Users
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("/api/users")
    suspend fun getUsers(@Query("page") page: Int): Users

    @GET("/api/users/{userId}")
    suspend fun getUser(@Path("userId") userId: Int): Users.User
}