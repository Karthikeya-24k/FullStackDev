package com.example.Todo.repository;

import com.example.Todo.entity.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<TodoEntity, Long> {
}
