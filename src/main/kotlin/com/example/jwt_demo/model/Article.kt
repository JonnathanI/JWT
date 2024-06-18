package com.example.jwt_demo.model

import java.util.*

data class Article(
    val id  : UUID,
    val title: String,
    val content: String,
)
