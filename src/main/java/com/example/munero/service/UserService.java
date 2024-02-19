package com.example.munero.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.munero.model.User;

@Service
public class UserService {
    private Map<String, User> users = new HashMap<>();

    public UserService() {
        // Initialize some dummy users
        users.put("user1", new User("user1", "password1"));
        users.put("user2", new User("user2", "password2"));
    }

    public boolean authenticate(String username, String password) {
        User user = users.get(username);
        return user != null && user.getPassword().equals(password);
    }
}
