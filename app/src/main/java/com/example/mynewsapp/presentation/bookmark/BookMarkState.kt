package com.example.mynewsapp.presentation.bookmark

import com.example.mynewsapp.domain.model.Article

data class BookMarkState(
    val articles:List<Article> = emptyList()

)