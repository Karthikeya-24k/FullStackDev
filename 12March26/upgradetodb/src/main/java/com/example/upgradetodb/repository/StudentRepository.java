package com.example.upgradetodb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.upgradetodb.entity.CollegeEntity;

public interface StudentRepository extends JpaRepository<CollegeEntity,Long> {
    
}
