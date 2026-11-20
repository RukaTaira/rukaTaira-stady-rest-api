package com.example.taira_api_v2.rest

import com.example.taira_api_v2.domain.Department
import com.example.taira_api_v2.domain.DepartmentId
import com.example.taira_api_v2.usecase.GetDepartmentUseCase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class DepartmentResource(
    private val getDepartmentUseCase: GetDepartmentUseCase
) {
    @GetMapping("/departments/{departmentId}")
    fun getDepartment(@PathVariable departmentId: DepartmentId): ResponseEntity<Department> {
        val department = getDepartmentUseCase.execute(departmentId)
        return ResponseEntity.ok(department)
    }
}