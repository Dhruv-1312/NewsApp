package com.example.mynewsapp.presentation.bookmark

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.mynewsapp.domain.model.Article
import com.example.mynewsapp.domain.usecases.news.SelectArticle

data class BookMarkState(
    val articles:List<Article> = emptyList()

)