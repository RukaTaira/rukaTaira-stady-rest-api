package com.example.taira_api_v2.rest

import com.example.taira_api_v2.domain.User
import com.example.taira_api_v2.usecase.GetUserDetailUseCase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class UserResource(
    private val getUserDetailUseCase: GetUserDetailUseCase,
) {
    @GetMapping("/user/{userId}")
    fun getUser(@PathVariable userId: String): ResponseEntity<User> {
        val userDetail = getUserDetailUseCase.execute(userId)
        return ResponseEntity.ok(userDetail)
    }
}
