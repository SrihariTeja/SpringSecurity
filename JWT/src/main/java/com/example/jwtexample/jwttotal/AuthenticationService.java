package com.example.jwtexample.jwttotal;



import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AuthenticationService {
    @Autowired
    private jwtutil jwtUtil;

    public String authenticate(String username, String password) {
        // Hardcoded user credentials
        if ("admin".equals(username) && "password".equals(password)) {
            Set<String> roles = new HashSet<>();
            roles.add("ROLE_ADMIN");
            return jwtUtil.generateToken(username, roles);
        }

        if ("user".equals(username) && "password".equals(password)) {
            Set<String> roles = new HashSet<>();
            roles.add("ROLE_USER");
            return jwtUtil.generateToken(username, roles);
        }

        throw new RuntimeException("Invalid credentials");
    }
}
