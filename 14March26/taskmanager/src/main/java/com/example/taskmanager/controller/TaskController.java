package com.example.taskmanager.controller;

import java.util.List;


import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.taskmanager.dto.ApiResponse;
import com.example.taskmanager.dto.TaskRequest;
import com.example.taskmanager.dto.TaskResponse;
import com.example.taskmanager.entity.TaskEntity;
import com.example.taskmanager.services.TaskServices;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private TaskServices services;

    public TaskController(TaskServices services) {
        this.services = services;
    }
    @PostMapping("/bulk")
    public ApiResponse<List<TaskResponse>> getTasks(@Valid @RequestBody List<TaskRequest> requests){
        List<TaskResponse> responses = services.gettaskResponses(requests);
        return new ApiResponse<List<TaskResponse>>("Success", responses);

    }
    @GetMapping
    public ApiResponse<org.springframework.data.domain.Page <TaskEntity>> returnAllTasks(Pageable pageable){
        org.springframework.data.domain.Page<TaskEntity> response = services.getTask(pageable);
        return new ApiResponse<>("Success", response);
    }
}
