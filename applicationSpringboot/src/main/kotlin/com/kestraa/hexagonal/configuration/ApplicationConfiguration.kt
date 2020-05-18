package com.kestraa.hexagonal.configuration

import com.kestraa.hexagonal.port.UserRepository
import com.kestraa.hexagonal.port.UserService
import com.kestraa.hexagonal.repository.UserRepositoryImpl
import com.kestraa.hexagonal.service.UserServiceImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ApplicationConfiguration {

    @Bean
    fun getUserService(userRepository: UserRepository?): UserService? {
        return UserServiceImpl(userRepository!!)
    }

    @Bean
    fun userRepository(): UserRepository? {
        return UserRepositoryImpl()
    }

}