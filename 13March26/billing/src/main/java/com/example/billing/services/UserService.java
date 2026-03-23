package com.example.billing.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.billing.dto.request.UserRequest;
import com.example.billing.entity.UserEntity;
import com.example.billing.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity createUser(UserRequest request) {

        UserEntity user = new UserEntity();
        user.setName(request.getCustname());

        return userRepository.save(user);
    }

    public List<UserEntity> getUsers() {
        return userRepository.findAll();
    }
}