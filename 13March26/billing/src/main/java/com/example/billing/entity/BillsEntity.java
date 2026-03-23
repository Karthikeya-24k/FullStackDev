package com.example.billing.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "bills")
public class BillsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long billid;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;

    public Long getId() {
        return billid;
    }

    public void setId(Long id) {
        this.billid = id;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }
}
