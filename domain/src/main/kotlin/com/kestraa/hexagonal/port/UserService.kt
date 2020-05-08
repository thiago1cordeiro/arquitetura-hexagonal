package com.kestraa.hexagonal.port

import com.kestraa.hexagonal.model.User

interface UserService {
    fun getUser(): List<User>
    fun createUser(user: User)
}