package com.example.taira_api_v2.port

import com.example.taira_api_v2.domain.Department
import com.example.taira_api_v2.domain.DepartmentId

interface DepartmentPort {
    fun findById(id: DepartmentId): Department
}
