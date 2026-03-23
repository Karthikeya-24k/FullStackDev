package com.example.collegeops.dto.request;

public class TeacherRequest {
     private String name;

    private String department;
    private String adderess;
    private String phoneNumber;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
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
    
}
