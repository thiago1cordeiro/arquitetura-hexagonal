package com.kestraa.hexagonal

import com.kestraa.hexagonal.model.User
import com.kestraa.hexagonal.port.UserRepository
import com.kestraa.hexagonal.service.UserService
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class UserServiceTest {

    private val userRepository = mockk<UserRepository>()
    private val userService = UserService(userRepository)

    @Test
    fun `Test Get Users`() {
        every { userRepository.getUsers() } returns listOf(mockUser)

        val users = userService.getUser()

        assert(users.isNotEmpty())
        assertEquals("João", users[0].name)
        verify(exactly = 1) { userService.getUser() }

    }

    @Test
    fun `Test Get Users With Empty List`() {
        every { userRepository.getUsers() } returns listOf()

        val users = userService.getUser()

        assert(users.isEmpty())
        verify(exactly = 1) { userService.getUser() }

    }

    @Test
    fun `Test Create User`() {
        every { userRepository.createUser(mockUser) } returns Unit

        userService.createUser(mockUser)

        verify(exactly = 1) { userService.createUser(mockUser) }

    }


    private val mockUser = User(id = 1, name = "João")


}