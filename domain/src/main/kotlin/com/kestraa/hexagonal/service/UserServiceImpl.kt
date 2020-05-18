package com.kestraa.hexagonal.service

import com.kestraa.hexagonal.model.User
import com.kestraa.hexagonal.port.UserService
import com.kestraa.hexagonal.port.UserRepository

class UserServiceImpl(private val userRepository: UserRepository) : UserService {
    override fun getUser(): List<User> {
        return userRepository.getUsers()
    }

    override fun createUser(user: User) {
        userRepository.createUser(user)
    }
}