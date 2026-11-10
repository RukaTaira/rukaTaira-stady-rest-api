package com.example.taira_api_v2.usecase

import com.example.taira_api_v2.domain.User
import com.example.taira_api_v2.port.UserPort
import org.springframework.stereotype.Component


@Component
class GetUserDetailUseCase(
    private val userPort: UserPort
) {
    fun execute(userId: String): User {
        return userPort.findById(userId)
    }
}

