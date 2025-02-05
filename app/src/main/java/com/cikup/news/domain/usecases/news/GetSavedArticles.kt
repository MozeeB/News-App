package com.cikup.news.domain.usecases.news

import com.cikup.news.data.local.NewsDao
import com.cikup.news.domain.model.Article
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetSavedArticles @Inject constructor(
    private val newsDao: NewsDao
) {
    suspend operator fun invoke(): Flow<List<Article>> = newsDao.getArticles()
}