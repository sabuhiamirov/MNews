package com.example.mnews.models

import androidx.lifecycle.MutableLiveData
import com.example.mnews.models.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)