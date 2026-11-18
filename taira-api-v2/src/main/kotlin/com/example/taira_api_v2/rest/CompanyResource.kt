package com.example.taira_api_v2.rest

import com.example.taira_api_v2.domain.Company
import com.example.taira_api_v2.domain.CompanyId
import com.example.taira_api_v2.usecase.GetCompanyUseCase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class CompanyResource(
    private val getCompanyUseCase: GetCompanyUseCase
) {
    @GetMapping("/companies/{companyId}")
    fun getCompany(@PathVariable companyId: CompanyId): ResponseEntity<Company> {
        val company = getCompanyUseCase.execute(companyId)
        return ResponseEntity.ok(company)
    }
}