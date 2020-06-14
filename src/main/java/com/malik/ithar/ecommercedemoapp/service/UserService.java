package com.malik.ithar.ecommercedemoapp.service;

import com.malik.ithar.ecommercedemoapp.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public int findTotalUsers() {
        return userRepository.findAll().size();
    }
}
