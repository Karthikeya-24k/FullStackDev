package com.example.billing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.billing.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity,Long> {
    
}
