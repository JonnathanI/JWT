package com.example.jwt_demo.service

import com.example.jwt_demo.model.Article
import com.example.jwt_demo.repository.ArticleRepository
import org.springframework.stereotype.Service

@Service
class ArticleService (
    private val articleRepository: ArticleRepository
    )
    {
        fun findAll(): List<Article> =
            articleRepository.findAll()
    }
