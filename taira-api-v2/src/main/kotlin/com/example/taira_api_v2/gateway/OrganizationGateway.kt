//package com.example.taira_api_v2.gateway
//
//import com.example.taira_api_v2.domain.Organization
//import com.example.taira_api_v2.port.OrganizationPort
//import org.springframework.stereotype.Component
//
//@Component
//class OrganizationGateway : OrganizationPort {
//    private val organizations = listOf(
//        Organization(10, "開発部"),
//        Organization(20, "営業部"),
//    )
//
//    override fun findById(id: Long): Organization? = organizations.find { it.id == id }
//}
