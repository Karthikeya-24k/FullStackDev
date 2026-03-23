package com.example.billing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.billing.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Long>{
    
}
