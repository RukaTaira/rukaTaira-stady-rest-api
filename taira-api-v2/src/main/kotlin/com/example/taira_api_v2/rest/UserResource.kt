package com.example.taira_api_v2.rest

import com.example.taira_api_v2.domain.User
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserResource {
    @GetMapping("/user")
    fun getUser(): ResponseEntity<User> {
        val user = User(
            "平良"
        )
        return ResponseEntity.ok(user)
    }
}