//package com.example.taira_api_v2.gateway
//
//import com.example.taira_api_v2.domain.Attendance
//import com.example.taira_api_v2.port.AttendancePort
//import org.springframework.stereotype.Component
//import java.time.LocalDate
//import java.time.LocalTime
//
//@Component
//class AttendanceGateway : AttendancePort {
//    private val attendances = listOf(
//        Attendance(1, LocalDate.of(2026, 11, 6), LocalTime.of(9, 0), LocalTime.of(18, 0)),
//        Attendance(1, LocalDate.of(2026, 11, 9), LocalTime.of(9, 0), LocalTime.of(19, 30)),
//        Attendance(2, LocalDate.of(2026, 11, 6), LocalTime.of(10, 0), LocalTime.of(19, 0)),
//        Attendance(2, LocalDate.of(2026, 11, 9), LocalTime.of(9, 30), LocalTime.of(18, 30)),
//        Attendance(3, LocalDate.of(2026, 11, 6), LocalTime.of(8, 30), LocalTime.of(17, 30)),
//        Attendance(3, LocalDate.of(2026, 11, 9), LocalTime.of(9, 0), LocalTime.of(20, 0)),
//        Attendance(4, LocalDate.of(2026, 11, 6), LocalTime.of(9, 0), LocalTime.of(18, 0)),
//        Attendance(4, LocalDate.of(2026, 11, 9), LocalTime.of(13, 0), LocalTime.of(18, 0)),
//    )
//
//    override fun findByUserId(userId: Long): List<Attendance> = attendances.filter { it.userId == userId }
//}
