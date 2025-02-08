package com.cikup.news.presentation.search

import androidx.paging.PagingData
import com.cikup.news.domain.model.Article
import kotlinx.coroutines.flow.Flow

data class SearchState(
    val searchQuery: String = "",
    val articles: Flow<PagingData<Article>>? = null
)