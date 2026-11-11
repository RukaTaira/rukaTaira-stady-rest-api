package com.example.taira_api_v2.port

import com.example.taira_api_v2.domain.User
import com.example.taira_api_v2.domain.UserId

interface UserPort {
    fun findById(id: UserId): User
}
