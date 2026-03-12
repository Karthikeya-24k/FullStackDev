package com.example.upgradetodb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.upgradetodb.entity.RegisterNumberEntity;

public interface RegistrationRepository extends JpaRepository<RegisterNumberEntity,Long>{

    
} 