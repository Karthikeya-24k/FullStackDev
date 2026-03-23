package com.example.collegeops.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.collegeops.entity.TeacherEntity;

public interface TeacherRepository extends JpaRepository<TeacherEntity,Long>{

    
} 
