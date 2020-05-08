package com.kestraa.hexagonal.controller;

import com.kestraa.hexagonal.dto.UserAdapter;
import com.kestraa.hexagonal.model.User;
import com.kestraa.hexagonal.port.UserPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserPort userPort;

    @GetMapping("/users")
    public ResponseEntity<?> getUsers() {
        return ResponseEntity.ok(userPort.getUser());
    }

    @PostMapping("/user")
    public ResponseEntity<?> createUser(@RequestBody UserAdapter userAdapter) {

        User user = new User(userAdapter.getId(), userAdapter.getName());

        userPort.createUser(user);

        return ResponseEntity.ok().build();
    }


}
