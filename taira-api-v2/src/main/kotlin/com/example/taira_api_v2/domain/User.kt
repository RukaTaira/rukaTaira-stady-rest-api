package com.example.taira_api_v2.domain

data class User(
    val userId: UserId,
    val name: String,
    val companyId: CompanyId,
    val departmentId: DepartmentId,
)
