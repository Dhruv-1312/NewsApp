package com.example.mynewsapp.domain.usecases.news

import com.example.mynewsapp.data.local.NewsDao
import com.example.mynewsapp.domain.model.Article
import kotlinx.coroutines.flow.Flow

class SelectArticles(
    private val newsDao: NewsDao
) {
      operator fun invoke(): Flow<List<Article>> {
       return newsDao.getArticles()
    }
}