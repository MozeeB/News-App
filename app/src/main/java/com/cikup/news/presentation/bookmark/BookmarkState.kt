package com.cikup.news.presentation.bookmark

import com.cikup.news.domain.model.Article

data class BookmarkState(
    val article: List<Article> = emptyList()
)