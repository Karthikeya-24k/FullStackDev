package com.example.Databaseop.controler;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Databaseop.dto.request.StudentRequest;
import com.example.Databaseop.dto.response.ApiResponse;
import com.example.Databaseop.dto.response.StudentResponse;
import com.example.Databaseop.services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
    public final StudentService student;

    public StudentController(StudentService student) {
        this.student = student;
    }
    @PostMapping("/calc")
    public ApiResponse<StudentResponse> getResult(@RequestBody StudentRequest request){
        return new ApiResponse<StudentResponse>("Success", student.processStudents(request));
    }
    @GetMapping("/result")
    public ApiResponse<List<StudentResponse>> getAllStudentResult(){
        List<StudentResponse> results = student.getAllStudentResults();
        return new ApiResponse<List<StudentResponse>>("Success", results);
    }
    
}
