package com.firstkmp_project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform