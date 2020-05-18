package com.kestraa.hexagonal.repository

import com.kestraa.hexagonal.model.User
import com.kestraa.hexagonal.port.UserRepository

class UserRepositoryImpl : UserRepository {

    private val listUsers = mutableListOf<User>()
    override fun getUsers(): List<User> {
        return listUsers
    }

    override fun createUser(user: User) {
        listUsers.add(user)
    }
}