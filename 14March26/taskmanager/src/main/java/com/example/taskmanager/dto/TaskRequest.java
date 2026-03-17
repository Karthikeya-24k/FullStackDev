package com.example.taskmanager.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class TaskRequest {

    @NotBlank(message = "Title should not be blank")
    private String title;
    private String description;

    @Positive(message = "No negative numbers are allowed")
    private Integer priority;
}
