package com.example.taira_api_v2.usecase

import com.example.taira_api_v2.domain.User
import com.example.taira_api_v2.port.UserPort
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GetUserDetailUseCaseTest {

    private val userPort = mockk<UserPort>()
    private val useCase = GetUserDetailUseCase(userPort)
    private val userId = mockk<String>()
    private val user = mockk<User>()

    @Test
    fun `ユーザー情報を取得し返す`() {
        every { userPort.findById(userId) } returns user

        assertEquals(user,useCase.execute(userId))
    }

    // TODO: UserIdドメイン消したけどだめでした
}