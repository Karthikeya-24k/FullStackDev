package com.example.Student.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student.dto.request.StudentRequest;
import com.example.Student.dto.response.ApiResponse;
import com.example.Student.dto.response.StudentResponse;
import com.example.Student.services.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping("/calc")
    public ApiResponse getResult(@RequestBody StudentRequest sRequest){
        StudentResponse result = studentService.calcStudentResponse(sRequest);
        return new  ApiResponse (
            "Success",result
        );
    }
}
