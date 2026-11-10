//package com.example.taira_api_v2.rest.response
//
//import com.example.taira_api_v2.domain.Attendance
//import com.example.taira_api_v2.usecase.UserDetail
//import java.time.Duration
//import java.time.format.DateTimeFormatter
//
//data class UserDetailResponse(
//    val id: Long,
//    val name: String,
//    val organization: OrganizationResponse,
//    val attendances: List<AttendanceResponse>,
//) {
//    companion object {
//        fun from(detail: UserDetail) = UserDetailResponse(
//            id = detail.user.id,
//            name = detail.user.name,
//            organization = OrganizationResponse(detail.organization.id, detail.organization.name),
//            attendances = detail.attendances.map { AttendanceResponse.from(it) },
//        )
//    }
//}
//
//data class OrganizationResponse(
//    val id: Long,
//    val name: String,
//)
//
//data class AttendanceResponse(
//    val date: String,
//    val clockIn: String,
//    val clockOut: String,
//    val workingMinutes: Long,
//) {
//    companion object {
//        private const val BREAK_MINUTES = 60L
//        private val TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm")
//
//        fun from(attendance: Attendance) = AttendanceResponse(
//            date = attendance.date.toString(),
//            clockIn = attendance.clockIn.format(TIME_FORMAT),
//            clockOut = attendance.clockOut.format(TIME_FORMAT),
//            workingMinutes = Duration.between(attendance.clockIn, attendance.clockOut).toMinutes() - BREAK_MINUTES,
//        )
//    }
//}
