package com.example.billing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.billing.entity.BillsEntity;

public interface BillsRepository extends JpaRepository<BillsEntity,Long>{
    
}
