package com.example.collegeops.controler;


import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.collegeops.dto.request.StudentRequest;
import com.example.collegeops.dto.request.TeacherRequest;
import com.example.collegeops.dto.response.ApiResponse;
import com.example.collegeops.dto.response.StudentResponse;
import com.example.collegeops.dto.response.TeacherResponse;
import com.example.collegeops.services.CollegeService;

@RestController
@RequestMapping("/college")
public class CollegeController {

    private final CollegeService collegeService;

    public CollegeController(CollegeService collegeService) {
        this.collegeService = collegeService;
    }

@PostMapping("/student")
public ApiResponse<StudentResponse> createStudent(@RequestBody StudentRequest request){

    StudentResponse response = collegeService.getStudentDetails(request);

    return new ApiResponse<>("success", response);
}
@PostMapping("/teacher")
public ApiResponse<TeacherResponse> createTeacher(@RequestBody TeacherRequest request){

    TeacherResponse response = collegeService.getTeacherDetails(request);

    return new ApiResponse<>("success", response);
}
@PostMapping("/assign/student")
public ApiResponse<StudentResponse> assignStudentCourse(
        @RequestParam Long studentId,

        @RequestParam String coursename){

    StudentResponse response =
            collegeService.assignStdCourse(studentId, coursename);

    return new ApiResponse<>("success", response);
}
@GetMapping("/students")
public ApiResponse<List<StudentResponse>> getStudents(){

    List<StudentResponse> students = collegeService.getFullStudentDetails();

    return new ApiResponse<>("success", students);
}

@GetMapping("/teachers")
public ApiResponse<List<TeacherResponse>> getTeachers(){

    List<TeacherResponse> teachers = collegeService.getFullTeacherDetails();

    return new ApiResponse<>("success", teachers);
}
@GetMapping("/courses")
public ApiResponse<List<String>> getCourses(){

    List<String> courses = collegeService.getRegisteredCourses();

    return new ApiResponse<>("success", courses);
}

}