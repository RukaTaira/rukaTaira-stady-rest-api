package com.example.taira_api_v2.port

import com.example.taira_api_v2.domain.Organization

interface OrganizationPort {
    fun findById(id: Long): Organization?
}
