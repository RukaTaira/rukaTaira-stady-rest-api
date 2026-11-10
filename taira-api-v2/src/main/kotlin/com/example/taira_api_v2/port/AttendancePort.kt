package com.example.taira_api_v2.port

import com.example.taira_api_v2.domain.Attendance

interface AttendancePort {
    fun findByUserId(userId: Long): List<Attendance>
}
