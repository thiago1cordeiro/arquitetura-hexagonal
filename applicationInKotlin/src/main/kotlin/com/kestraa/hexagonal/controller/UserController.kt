package com.kestraa.hexagonal.controller

import com.kestraa.hexagonal.model.User
import com.kestraa.hexagonal.port.UserService


class UserController(private val userService: UserService) {
    fun getUsers(): List<User> {
        return userService.getUser()
    }

    fun createUser(user: User){
        userService.createUser(user)
    }
}