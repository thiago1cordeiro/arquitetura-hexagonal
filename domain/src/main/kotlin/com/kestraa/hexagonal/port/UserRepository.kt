package com.kestraa.hexagonal.port

import com.kestraa.hexagonal.model.User

interface UserRepository {
    fun getUsers(): List<User>
    fun createUser(user: User)
}