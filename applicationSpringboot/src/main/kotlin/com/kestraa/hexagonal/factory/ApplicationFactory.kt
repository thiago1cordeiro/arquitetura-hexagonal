package com.kestraa.hexagonal.factory

import com.kestraa.hexagonal.controller.UserController
import com.kestraa.hexagonal.repository.UserRepositoryImpl
import com.kestraa.hexagonal.service.UserServiceImpl

class ApplicationFactory {

    companion object {
        private val userRepository = UserRepositoryImpl()
        private val userService = UserServiceImpl(userRepository)
        val userController = UserController(userService)
    }
}