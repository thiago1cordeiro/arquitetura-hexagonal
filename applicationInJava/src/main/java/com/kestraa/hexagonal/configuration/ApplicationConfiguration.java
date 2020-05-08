package com.kestraa.hexagonal.configuration;

import com.kestraa.hexagonal.port.UserService;
import com.kestraa.hexagonal.port.UserRepository;
import com.kestraa.hexagonal.repository.UserRepositoryImpl;
import com.kestraa.hexagonal.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public UserService getUserService(UserRepository userRepository ) {
        return new UserServiceImpl(userRepository);
    }

    @Bean
    public UserRepository userRepository() {
        return new UserRepositoryImpl();
    }
}