package com.example.taira_api_v2.domain

import java.time.LocalDate
import java.time.LocalTime

data class Attendance(
    val userId: String,
    val date: LocalDate,
    val clockIn: LocalTime,
    val clockOut: LocalTime,
)
