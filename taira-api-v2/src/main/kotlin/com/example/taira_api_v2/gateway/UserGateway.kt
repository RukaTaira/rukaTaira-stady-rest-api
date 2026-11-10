package com.example.taira_api_v2.gateway

import com.example.taira_api_v2.domain.User
import com.example.taira_api_v2.port.UserPort
import org.springframework.stereotype.Component

@Component
class UserGateway : UserPort {
    override fun findById(id: String): User {
        return User(
            id = TODO(),
            name = TODO(),
            organizationId = TODO()
        )
    }

}
