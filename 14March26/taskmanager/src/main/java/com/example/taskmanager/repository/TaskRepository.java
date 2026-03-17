package com.example.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.taskmanager.entity.TaskEntity;

public interface TaskRepository extends JpaRepository<TaskEntity,Long> {
    
}
