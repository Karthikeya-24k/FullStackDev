package com.example.Student.services;

import org.springframework.stereotype.Service;

import com.example.Student.dto.request.StudentRequest;
import com.example.Student.dto.response.StudentResponse;

@Service
public class StudentService {
    public StudentResponse calcStudentResponse(StudentRequest request){
        int Total = 0;
        Total = request.getMarks1()+request.getMarks2()+request.getMarks3()+request.getMarks4()+request.getMarks5();
        
        double percentage = Total/5.0;
        String result = percentage>=75 ? "PASS": "FAIL";
        return new StudentResponse(request.getName(),request.getRollNumber(), Total, percentage, result);

    }
}
