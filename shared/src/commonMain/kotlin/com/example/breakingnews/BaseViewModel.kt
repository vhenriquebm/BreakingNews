package com.example.breakingnews

import kotlinx.coroutines.CoroutineScope

expect open class BaseViewModel {

    val scope: CoroutineScope



}