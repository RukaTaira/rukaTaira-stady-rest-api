package com.example.taira_api_v2.port

import com.example.taira_api_v2.domain.Company

interface OrganizationPort {
    fun findById(id: Long): Company?
}
