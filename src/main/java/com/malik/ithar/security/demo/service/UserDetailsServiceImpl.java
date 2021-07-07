package com.malik.ithar.security.demo.service;

import com.malik.ithar.security.demo.model.User;
import expection.UserNotFoundException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service(value = "userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService  {

    private final UserService userService;

    public UserDetailsServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user;
        try {
            user = userService.findByUsername(username);
        } catch (UserNotFoundException e) {
            throw new UsernameNotFoundException("Invalid username or password.");
        }

        List<GrantedAuthority> authorities = user
                .getUserRole()
                .stream()
                .map(role -> new SimpleGrantedAuthority(role.getRole().name()))
                .collect(Collectors.toList());

        return getUser(user.getUsername(), user.getPassword(), authorities);
    }

    private org.springframework.security.core.userdetails.User getUser(String username, String pwd, List<GrantedAuthority> authorities) {
        return new org.springframework.security.core.userdetails.User(username, pwd, authorities);
    }
}
