package com.example.collegeops.dto.response;

public class StudentResponse {
    private Long studid;
    private String name;
    private String phoneNumber;
    private String address;
    private String coursename;
    
    public StudentResponse(Long id, String name, String phoneNumber, String address, String coursename) {
        this.studid = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.coursename = coursename;
    }
    
    public StudentResponse(Long studid, String name, String coursename) {
        this.studid = studid;
        this.name = name;
        this.coursename = coursename;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Long getStudid() {
        return studid;
    }
    public void setStudid(Long id) {
        this.studid = id;
    }
    public String getCoursename() {
        return coursename;
    }
    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }
    
}
