package com.example.jwt_demo.controller.article

import java.util.UUID

data class ArticleResponse(
    val id: UUID,
    val title: String,
    val content: String,
)
