package com.example.collegeops.dto.response;

public class CourseRegistrationResponse {
    private Long courseid;
    private String course;
    
    public CourseRegistrationResponse(Long courseid, String course) {
        this.courseid = courseid;
        this.course = course;
    }
    public Long getCourseid() {
        return courseid;
    }
    public void setCourseid(Long courseid) {
        this.courseid = courseid;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    
}
