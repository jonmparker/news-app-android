package com.example.newsapp.ui.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsapp.network.models.Article
import com.example.newsapp.network.NetworkResult
import com.example.newsapp.repository.NewsRepository
import kotlinx.coroutines.launch

class NewsViewModel(private val repository: NewsRepository) : ViewModel() {
    val news = MutableLiveData<NetworkResult<List<Article>>>()

    fun loadNews() {
        viewModelScope.launch {
            news.value = NetworkResult.Loading
            news.value = repository.fetchNews()
        }
    }
}