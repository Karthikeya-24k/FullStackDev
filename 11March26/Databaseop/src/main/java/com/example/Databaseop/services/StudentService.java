package com.example.Databaseop.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Databaseop.dto.request.StudentRequest;
import com.example.Databaseop.dto.response.StudentResponse;
import com.example.Databaseop.entity.Student;
import com.example.Databaseop.repository.StudentRepository;
@Service
public class StudentService {
    public final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public StudentResponse processStudents(StudentRequest request){

        int totalMarks = request.getMarks().stream().mapToInt(Integer::intValue).sum();
        int subject = request.getMarks().size();
        double percentage = (double)totalMarks/subject;
        String status = percentage >=75?"PASS":"FAIL";

        Student student = new Student();
        student.setName(request.getName());
        student.setRollNumber(request.getRollNumber());
        student.setTotalMarks(totalMarks);
        student.setPercentage(percentage);
        student.setResult(status);

        studentRepository.save(student);
        return new StudentResponse(request.getName(), request.getRollNumber(), totalMarks, percentage, status);

}
    public List<StudentResponse>getAllStudentResults(){
        return studentRepository.findAll().stream().map(student -> new StudentResponse(student.getName(),student.getRollNumber() , student.getTotalMarks(), student.getPercentage(), student.getResult())).toList();
    }
}
