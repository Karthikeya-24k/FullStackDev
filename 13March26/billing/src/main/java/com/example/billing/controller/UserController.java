package com.example.billing.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.billing.dto.request.UserRequest;
import com.example.billing.dto.response.ApiResponse;
import com.example.billing.dto.response.UserResponse;
import com.example.billing.entity.UserEntity;
import com.example.billing.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ApiResponse<UserResponse> createUser(@RequestBody UserRequest request) {

        UserResponse response = userService.createUser(request);

        return new ApiResponse<>(
                "SUCCESS",
                "User created successfully",
                response
        );
    }

    @GetMapping
    public ApiResponse<List<UserResponse>> getAllUsers() {

        List<UserResponse> users = userService.getAllUsers();

        return new ApiResponse<>(
                "SUCCESS",
                "Users fetched successfully",
                users
        );
    }
}