package com.example.taira_api_v2.usecase

import com.example.taira_api_v2.domain.Department
import com.example.taira_api_v2.domain.DepartmentId
import com.example.taira_api_v2.port.DepartmentPort
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class GetDepartmentUseCaseTest {
    private val departmentPort = mockk<DepartmentPort>()
    private val useCase = GetDepartmentUseCase(departmentPort)
    private val departmentId = mockk<DepartmentId>()
    private val department = mockk<Department>()

    @Test
    fun `部署情報を取得し返す`() {
        every { departmentPort.findById(departmentId) } returns department

        assertEquals(department, useCase.execute(departmentId))

    }
}