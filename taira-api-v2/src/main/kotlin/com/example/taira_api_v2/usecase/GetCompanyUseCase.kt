package com.example.taira_api_v2.usecase

import com.example.taira_api_v2.domain.Company
import com.example.taira_api_v2.domain.CompanyId
import com.example.taira_api_v2.port.CompanyPort
import org.springframework.stereotype.Component

@Component
class GetCompanyUseCase(
    private val companyPort: CompanyPort
) {
    fun execute(companyId: CompanyId): Company {
        return companyPort.findById(companyId)
    }
}
