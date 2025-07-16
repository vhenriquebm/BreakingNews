package com.example.breakingnews

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform