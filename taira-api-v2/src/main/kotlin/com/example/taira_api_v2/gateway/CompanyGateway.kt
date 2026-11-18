package com.example.taira_api_v2.gateway

import com.example.taira_api_v2.domain.Company
import com.example.taira_api_v2.domain.CompanyId
import com.example.taira_api_v2.domain.CompanyName
import com.example.taira_api_v2.port.CompanyPort
import org.springframework.stereotype.Component

@Component
class CompanyGateway : CompanyPort {
    private val companies = listOf(
        Company(CompanyId("org001"), CompanyName("companyAAA")),
        Company(CompanyId("org002"), CompanyName("companyBBB"))
    )

    override fun findById(id: CompanyId): Company {
        return companies.find { it.companyId == CompanyId(id.id) }
            ?: throw NoSuchElementException("企業がありません companyId = ${id.id}")
    }
}