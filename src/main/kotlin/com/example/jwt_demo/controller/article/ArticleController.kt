package com.example.jwt_demo.controller.article

import com.example.jwt_demo.model.Article
import com.example.jwt_demo.service.ArticleService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/article")
class ArticleController (
    private val articleService: ArticleService
) {
    @GetMapping
    fun listAll(): List<ArticleResponse> =
        articleService.findAll()
            .map { it.toResponse() }
    private fun Article.toResponse(): ArticleResponse =
        ArticleResponse(
            id = this.id,
            title = this.title,
            content = this.content,
        )
}