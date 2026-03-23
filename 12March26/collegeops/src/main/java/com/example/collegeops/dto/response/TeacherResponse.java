package com.example.collegeops.dto.response;

public class TeacherResponse {
    private Long teachid;
    private String name;
    private String adderess;
    private String phoneNumber;
    private String coursename;
    
    public TeacherResponse(Long teachid, String name, String adderess, String phoneNumber, String coursename) {
        this.teachid = teachid;
        this.name = name;
        this.adderess = adderess;
        this.phoneNumber = phoneNumber;
        this.coursename = coursename;
    }
    
    public TeacherResponse(Long teachid, String name, String coursename) {
        this.teachid = teachid;
        this.name = name;
        this.coursename = coursename;
    }

    public Long getTeachid() {
        return teachid;
    }
    public void setTeachid(Long id) {
        this.teachid = id;
    }
    public String getAdderess() {
        return adderess;
    }
    public void setAdderess(String adderess) {
        this.adderess = adderess;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCoursename() {
        return coursename;
    }
    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }
    
}
