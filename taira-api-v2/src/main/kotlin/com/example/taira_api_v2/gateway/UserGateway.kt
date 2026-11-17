package com.example.taira_api_v2.gateway

import com.example.taira_api_v2.domain.CompanyId
import com.example.taira_api_v2.domain.DepartmentId
import com.example.taira_api_v2.domain.User
import com.example.taira_api_v2.domain.UserId
import com.example.taira_api_v2.port.UserPort
import org.springframework.stereotype.Component

@Component
class UserGateway : UserPort {
    private val users = listOf(
        User(UserId("001"), "Taira",  CompanyId("org001"), DepartmentId("0D001")),
        User(UserId("002"), "Toyota", CompanyId("org001"), DepartmentId("0D002")),
        User(UserId("003"), "Suzuki", CompanyId("org001"), DepartmentId("0D003")),
        User(UserId("004"), "Honda",  CompanyId("org002"), DepartmentId("0D001")),
        User(UserId("005"), "Subaru", CompanyId("org002"), DepartmentId("0D002")),
    )

    override fun findById(id: UserId): User {
        return users.find { it.userId == UserId(id.Id) }
            ?: throw NoSuchElementException("ユーザーがありません userId = ${id.Id}")
    }

}
