package com.example.collegeops.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "teacher")
public class TeacherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String name;
    private String adderess;
    private String phoneNumber;

    @OneToOne(mappedBy = "teacher")
    private RegistrationEntity teachRegistrationEntities;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
    public RegistrationEntity getTeachRegistrationEntities() {
        return teachRegistrationEntities;
    }
    public void setTeachRegistrationEntities(RegistrationEntity teachRegistrationEntities) {
        this.teachRegistrationEntities = teachRegistrationEntities;
    }
}
