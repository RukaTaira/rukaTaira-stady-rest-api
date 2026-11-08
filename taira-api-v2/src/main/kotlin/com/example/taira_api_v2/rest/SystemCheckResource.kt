package com.example.taira_api_v2.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SystemCheckResource {
    @GetMapping("/ping")
    fun ping() = "pong"
}