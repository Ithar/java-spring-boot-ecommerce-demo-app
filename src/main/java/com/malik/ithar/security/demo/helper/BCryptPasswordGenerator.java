package com.malik.ithar.security.demo.helper;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordGenerator {

    private static final String PASSWORD = "Admin#123";

    public static void main(String[] args) {

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(PASSWORD);

        System.out.println(hashedPassword);


    }


}
