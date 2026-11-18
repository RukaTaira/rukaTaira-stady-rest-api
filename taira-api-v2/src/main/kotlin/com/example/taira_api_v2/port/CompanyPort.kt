package com.example.taira_api_v2.port

import com.example.taira_api_v2.domain.Company
import com.example.taira_api_v2.domain.CompanyId

interface CompanyPort {
    fun findById(id: CompanyId): Company
}
