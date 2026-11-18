package com.example.taira_api_v2.usecase

import com.example.taira_api_v2.domain.Company
import com.example.taira_api_v2.domain.CompanyId
import com.example.taira_api_v2.port.CompanyPort
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class GetCompanyUseCaseTest {
    private val companyPort = mockk<CompanyPort>()
    private val useCase = GetCompanyUseCase(companyPort)
    private val companyId = mockk<CompanyId>()
    private val company = mockk<Company>()

    @Test
    fun `企業情報を取得し返す`() {
        every { companyPort.findById(companyId) } returns company

        assertEquals(company, useCase.execute(companyId))
    }
}