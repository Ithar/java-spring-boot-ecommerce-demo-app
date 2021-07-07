package com.malik.ithar.security.demo.service;

import com.malik.ithar.security.demo.model.User;
import com.malik.ithar.security.demo.repository.UserRepository;
import expection.UserNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public int findTotalUsers() {
        return userRepository.findAll().size();
    }

    public User findByUsername(String username) throws UserNotFoundException {

        List<User> users = userRepository.findByUsername(username);

        if (users.isEmpty()) {
            throw new UserNotFoundException("The username " + username + " is not found.");
        }

        if (users.size() != 1) {
            throw new UserNotFoundException("Too many users with username " + username + "; expecting only one.");
        }

        return users.get(0);
    }
}
