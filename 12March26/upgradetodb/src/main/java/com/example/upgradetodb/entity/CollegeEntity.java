package com.example.upgradetodb.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class CollegeEntity {
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "username")
    private String name;

    @OneToOne
    @JoinColumn(name = "register_id")
    private RegisterNumberEntity registerNumberEntity;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RegisterNumberEntity getRegisterNumberEntity() {
        return registerNumberEntity;
    }

    public void setRegisterNumberEntity(RegisterNumberEntity registerNumberEntity) {
        this.registerNumberEntity = registerNumberEntity;
    }
    
}
