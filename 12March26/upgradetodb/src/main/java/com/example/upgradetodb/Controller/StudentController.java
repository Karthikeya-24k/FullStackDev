package com.example.upgradetodb.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.upgradetodb.dto.request.RegisterRequest;
import com.example.upgradetodb.dto.request.StudentRequest;
import com.example.upgradetodb.dto.response.ApiResponse;
import com.example.upgradetodb.dto.response.StudentResponse;
import com.example.upgradetodb.services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService service;
    

    public StudentController(StudentService service) {
        this.service = service;
    }
    @PostMapping("/add")
    public ApiResponse<StudentResponse>createStudent(@RequestBody StudentRequest req){
        return new ApiResponse<StudentResponse>("Success", service.getStudentDetails(req));
    }
    @PostMapping("/{id}/register")
    public ApiResponse<StudentResponse> assignReg(@PathVariable Long id, @RequestBody RegisterRequest regNumber){
        StudentResponse response = service.assignRegistration(id, regNumber.getRegisterNumber());
        return new ApiResponse<StudentResponse>("Success", response);

    }
}
