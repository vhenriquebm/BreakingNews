package com.example.breakingnews.articles

import com.example.breakingnews.BaseViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ArticlesViewModel : BaseViewModel() {
    private val _articlesState: MutableStateFlow<ArticleState> = MutableStateFlow(ArticleState())
    val articleState: StateFlow<ArticleState> get() = _articlesState

    init {
        getArticles()
    }

    private fun getArticles() {
        scope.launch {
            delay(500)
            _articlesState.emit(ArticleState())
        }
    }
}