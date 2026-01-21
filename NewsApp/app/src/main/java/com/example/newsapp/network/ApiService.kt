package com.example.newsapp.network

import com.example.newsapp.network.models.NewsResponse
import retrofit2.http.GET

interface ApiService {
    @GET("news")
    suspend fun getNews(): NewsResponse
}