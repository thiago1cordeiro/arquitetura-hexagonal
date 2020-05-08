package com.kestraa.hexagonal.repository;

import com.kestraa.hexagonal.model.User;
import com.kestraa.hexagonal.port.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private List<User> users = new ArrayList<>();

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public void createUser(User user) {
        users.add(user);
    }
}
