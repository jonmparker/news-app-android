package com.example.newsapp.repository

import com.example.newsapp.network.models.Article
import com.example.newsapp.network.ApiService
import com.example.newsapp.network.NetworkResult

class NewsRepository(private val api: ApiService) {
    suspend fun fetchNews(): NetworkResult<List<Article>> {
        return try {
            val response = api.getNews()
            NetworkResult.Success(response.articles)
        } catch (e: Exception) {
            NetworkResult.Error(e.localizedMessage ?: "Unknown error")
        }
    }
}