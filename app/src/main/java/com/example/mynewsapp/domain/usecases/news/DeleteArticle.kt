package com.example.mynewsapp.domain.usecases.news

import com.example.mynewsapp.data.local.NewsDao
import com.example.mynewsapp.domain.model.Article

class DeleteArticle(
    private val newsDao: NewsDao
) {

    suspend operator fun invoke(article: Article) {
        newsDao.delete(article)
    }
}