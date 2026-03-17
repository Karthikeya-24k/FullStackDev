package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.BillIItemEntity;

public interface BillItemRepository extends JpaRepository<BillIItemEntity,Long>{
   List<BillIItemEntity> findByBillsEntityId(Long billId);
}
