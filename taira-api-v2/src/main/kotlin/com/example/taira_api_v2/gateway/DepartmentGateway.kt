package com.example.taira_api_v2.gateway

import com.example.taira_api_v2.domain.Department
import com.example.taira_api_v2.domain.DepartmentId
import com.example.taira_api_v2.domain.DepartmentName
import com.example.taira_api_v2.port.DepartmentPort
import org.springframework.stereotype.Component

@Component
class DepartmentGateway: DepartmentPort {
    private val departments = listOf(
        Department(DepartmentId("0D001"), DepartmentName("営業")),
        Department(DepartmentId("0D002"), DepartmentName("開発")),
        Department(DepartmentId("0D003"), DepartmentName("開発"))
        )
    override fun findById(id: DepartmentId): Department {
        return departments.find { it.departmentId == DepartmentId(id.Id) }
            ?: throw NoSuchElementException("部署がありません departmentId = ${id.Id}")
    }
}