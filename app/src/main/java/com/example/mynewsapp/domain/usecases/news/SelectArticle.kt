package com.example.mynewsapp.domain.usecases.news

import com.example.mynewsapp.data.local.NewsDao
import com.example.mynewsapp.domain.model.Article

class SelectArticle  (
    private val newsDao: NewsDao,
){
    suspend operator fun invoke(url: String):Article?{
        return newsDao.getArticle(url)
    }
}