package com.example.collegeops.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "courseregistration")
public class RegistrationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String coursename;

    @OneToOne
    @JoinColumn(name = "stud_id")
    private StudentEntity student;
    
    @OneToOne
    @JoinColumn(name = "teach_id")
    private TeacherEntity teacher;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public StudentEntity getStudent() {
        return student;
    }

    public void setStudent(StudentEntity entity) {
        this.student = entity;
    }
    public TeacherEntity getTeacher() {
    return teacher;
}

public void setTeacher(TeacherEntity teacher) {
    this.teacher = teacher;
}
}
