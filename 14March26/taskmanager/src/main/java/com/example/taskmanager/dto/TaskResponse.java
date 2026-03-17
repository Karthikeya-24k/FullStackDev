package com.example.taskmanager.dto;

import lombok.Data;

@Data
public class TaskResponse {
    private Long id;
    private String name;
    private String description;
    private Integer priority;
}
