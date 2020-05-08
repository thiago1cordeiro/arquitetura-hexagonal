package com.kestraa.hexagonal.controller

import com.kestraa.hexagonal.model.User
import com.kestraa.hexagonal.port.UserPort


class UserController(private val userPort: UserPort) {
    fun getUsers(): List<User> {
        return userPort.getUser()
    }

    fun createUser(user: User){
        userPort.createUser(user)
    }
}