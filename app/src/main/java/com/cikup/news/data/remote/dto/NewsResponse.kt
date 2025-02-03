package com.cikup.news.data.remote.dto

import com.cikup.news.domain.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResult: Int
)