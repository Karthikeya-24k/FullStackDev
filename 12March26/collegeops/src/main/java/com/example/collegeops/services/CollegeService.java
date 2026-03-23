package com.example.collegeops.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.collegeops.dto.request.StudentRequest;
import com.example.collegeops.dto.request.TeacherRequest;
import com.example.collegeops.dto.response.StudentResponse;
import com.example.collegeops.dto.response.TeacherResponse;
import com.example.collegeops.entity.RegistrationEntity;
import com.example.collegeops.entity.StudentEntity;
import com.example.collegeops.entity.TeacherEntity;
import com.example.collegeops.repository.RegistrationRepository;
import com.example.collegeops.repository.StudentRepository;
import com.example.collegeops.repository.TeacherRepository;

@Service
public class CollegeService {
  public final StudentRepository studentRepository;
    public final TeacherRepository teacherRepository;
    public final RegistrationRepository registrationRepository;

    public CollegeService(StudentRepository studentRepository,
                          TeacherRepository teacherRepository,
                          RegistrationRepository registrationRepository) {
        this.studentRepository = studentRepository;
        this.teacherRepository = teacherRepository;
        this.registrationRepository = registrationRepository;
    }

    public StudentResponse getStudentDetails(StudentRequest request) {

        StudentEntity entity = new StudentEntity();
        entity.setName(request.getName());
        entity.setAddress(request.getAddress());
        entity.setPhoneNumber(request.getPhoneNumber());

        StudentEntity saved = studentRepository.save(entity);

        return new StudentResponse(
                saved.getId(),
                saved.getName(),
                saved.getPhoneNumber(),
                saved.getAddress(),
                null
        );
    }

    public TeacherResponse getTeacherDetails(TeacherRequest req) {

        TeacherEntity entity = new TeacherEntity();
        entity.setName(req.getName());
        entity.setAdderess(req.getAdderess());
        entity.setPhoneNumber(req.getPhoneNumber());

        TeacherEntity saved = teacherRepository.save(entity);

        return new TeacherResponse(
                saved.getId(),
                saved.getName(),
                saved.getAdderess(),
                saved.getPhoneNumber(),
                null
        );
    }

    public StudentResponse assignStdCourse(Long id, String coursename) {

        StudentEntity student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student Not Found"));

        RegistrationEntity registration = new RegistrationEntity();
        registration.setCoursename(coursename);
        registration.setStudent(student);

        registrationRepository.save(registration);

        return new StudentResponse(
                student.getId(),
                student.getName(),
                student.getPhoneNumber(),
                student.getAddress(),
                coursename
        );
    }

public TeacherResponse assignTeacherCourse(Long teachid, String coursename){
    TeacherEntity entity = teacherRepository.findById(teachid).orElseThrow(
        () -> new RuntimeException("Teacher not found")
    );
    RegistrationEntity registrationEntity = new RegistrationEntity();
    registrationEntity.setCoursename(coursename);
    registrationEntity.setId(entity.getId());
    registrationRepository.save(registrationEntity);

    return new TeacherResponse(teachid, entity.getName(), coursename);
}
public List<StudentResponse> getFullStudentDetails(){

    return studentRepository.findAll().stream()
            .map(stud -> {

                String course = null;

                if(stud.getRegistrations() != null){
                    course = stud.getRegistrations().getCoursename();
                }

                return new StudentResponse(
                        stud.getId(),
                        stud.getName(),
                        stud.getPhoneNumber(),
                        stud.getAddress(),
                        course
                );
            })
            .toList();
}

public List<TeacherResponse> getFullTeacherDetails(){

    return teacherRepository.findAll().stream()
            .map(teacher -> {

                String course = null;

                if(teacher.getTeachRegistrationEntities() != null){
                    course = teacher.getTeachRegistrationEntities().getCoursename();
                }

                return new TeacherResponse(
                        teacher.getId(),
                        teacher.getName(),
                        teacher.getAdderess(),
                        teacher.getPhoneNumber(),
                        course
                );
            })
            .toList();
}
public List<String> getRegisteredCourses(){

    return registrationRepository.findAll()
            .stream()
            .map(reg -> reg.getCoursename()).distinct()
            .toList();
}
}
