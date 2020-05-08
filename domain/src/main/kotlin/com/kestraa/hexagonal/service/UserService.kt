package com.kestraa.hexagonal.service

import com.kestraa.hexagonal.model.User
import com.kestraa.hexagonal.port.UserPort
import com.kestraa.hexagonal.port.UserRepository

class UserService(val userRepository: UserRepository) : UserPort {
    override fun getUser(): List<User> {
        return userRepository.getUsers()
    }

    override fun createUser(user: User) {
        userRepository.createUser(user)
    }
}