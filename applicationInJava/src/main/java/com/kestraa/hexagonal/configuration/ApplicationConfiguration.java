package com.kestraa.hexagonal.configuration;

import com.kestraa.hexagonal.port.UserPort;
import com.kestraa.hexagonal.port.UserRepository;
import com.kestraa.hexagonal.repository.UserRepositoryImpl;
import com.kestraa.hexagonal.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public UserPort getUserService(UserRepository userRepository ) {
        return new UserService(userRepository);
    }

    @Bean
    public UserRepository userRepository() {
        return new UserRepositoryImpl();
    }
}