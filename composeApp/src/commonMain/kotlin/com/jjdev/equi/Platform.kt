package com.jjdev.equi

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform