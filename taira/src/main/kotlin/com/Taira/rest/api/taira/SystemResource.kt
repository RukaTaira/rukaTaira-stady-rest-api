package com.Taira.rest.api.taira

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SystemResource {
    @GetMapping("/ping")
    fun pingPng(): String {
        return "pong"
    }
}