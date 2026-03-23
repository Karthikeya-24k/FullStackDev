package com.example.collegeops.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.collegeops.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity,Long>{

    
} 
