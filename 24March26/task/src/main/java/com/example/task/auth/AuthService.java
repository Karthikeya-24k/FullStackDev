package com.example.task.auth;

import com.example.task.JwtUtil;
import com.example.task.config.User;
import com.example.task.user.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private final UserRepository userRepository;
    private  final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    public AuthService(UserRepository userRepository, PasswordEncoder passwordEncoder, JwtUtil jwtUtil) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtUtil = jwtUtil;
    }
    public String register(String username, String password){
        if(userRepository.findByUsername(username).isPresent()){
            throw new RuntimeException("User already exists");
        }
            String hashedPassword = passwordEncoder.encode(password);
            User user = new User(username,hashedPassword);
            userRepository.save(user);
            return  "User Registered Successfully";
    }
    public String login(String username, String password) {
        User user = userRepository.findByUsername(username).orElseThrow(() -> new RuntimeException("User not found"));

        boolean isMatch = passwordEncoder.matches(password, user.getPassword());
        if(!isMatch){
            throw new RuntimeException("Invalid credentials");
        }
        return jwtUtil.generateTokens(username);
    }
}
