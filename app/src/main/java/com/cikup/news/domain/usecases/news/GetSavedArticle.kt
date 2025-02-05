package com.cikup.news.domain.usecases.news

import com.cikup.news.data.local.NewsDao
import com.cikup.news.domain.model.Article
import javax.inject.Inject

class GetSavedArticle @Inject constructor(
    private val newsDao: NewsDao
) {
    suspend operator fun invoke(url: String): Article? = newsDao.getArticle(url = url)
}