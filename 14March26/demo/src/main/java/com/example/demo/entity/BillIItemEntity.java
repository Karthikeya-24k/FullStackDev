package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "billitems")
public class BillIItemEntity {
    @Id
    @GeneratedValue
    private Long id;
    
    private Integer qty;
    
    @ManyToOne
@JoinColumn(name = "bill_id")
private BillsEntity billsEntity;

@ManyToOne
@JoinColumn(name = "prod_id")
private ProductEntity productEntity;

     private Double price;
    private Double tax;
    private Double total;

}
