package com.kestraa.hexagonal.port

import com.kestraa.hexagonal.model.User

interface UserPort {
    fun getUser(): List<User>
    fun createUser(user: User)
}