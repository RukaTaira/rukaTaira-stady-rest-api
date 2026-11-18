package com.example.taira_api_v2.domain

data class User(
    val userId: UserId,
    val name: UserName,
    val companyId: CompanyId,
    val departmentId: DepartmentId,
)
