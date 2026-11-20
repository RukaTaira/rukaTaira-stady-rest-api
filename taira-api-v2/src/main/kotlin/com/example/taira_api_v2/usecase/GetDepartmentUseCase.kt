package com.example.taira_api_v2.usecase

import com.example.taira_api_v2.domain.Department
import com.example.taira_api_v2.domain.DepartmentId
import com.example.taira_api_v2.port.DepartmentPort
import org.springframework.stereotype.Component

@Component
class GetDepartmentUseCase(
    private val departmentPort: DepartmentPort
) {
    fun execute(departmentId: DepartmentId): Department {
        return departmentPort.findById(departmentId)
    }
}