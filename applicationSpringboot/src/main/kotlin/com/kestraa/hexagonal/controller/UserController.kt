package com.kestraa.hexagonal.controller

import com.kestraa.hexagonal.model.User
import com.kestraa.hexagonal.port.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController @Autowired constructor(private val userService: UserService) {
    @GetMapping("/users")
    fun getUsers(): List<User> {
        return userService.getUser()
    }

    @PostMapping("/user")
    fun createUser(@RequestBody user: User){
        userService.createUser(user)
    }
}