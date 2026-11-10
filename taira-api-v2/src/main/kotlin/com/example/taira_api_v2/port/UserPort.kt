package com.example.taira_api_v2.port

import com.example.taira_api_v2.domain.User

interface UserPort {
    fun findById(id: String): User
}
