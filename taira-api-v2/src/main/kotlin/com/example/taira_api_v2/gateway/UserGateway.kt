package com.example.taira_api_v2.gateway

import com.example.taira_api_v2.domain.User
import com.example.taira_api_v2.domain.UserId
import com.example.taira_api_v2.port.UserPort
import org.springframework.aot.hint.TypeReference.listOf
import org.springframework.stereotype.Component

@Component
class UserGateway : UserPort {
    private val users = listOf(
        User("001", "Taira", "org001"),
        User("002", "Toyota", "org002"),
        User("003", "Suzuki", "org003"),
        User("004", "Honda", "org004"),
        User("005", "Subaru", "org005"),
    )

    override fun findById(id: UserId): User {
        return users.find { it.userId == id.userId }
            ?: throw NoSuchElementException("ユーザーがありません userId = ${id.userId}")
    }

}
