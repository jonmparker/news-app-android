package com.example.newsapp.network.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Article(
    val id: String? = null,
    val title: String? = null,
    val description: String? = null,
    val url: String? = null
)