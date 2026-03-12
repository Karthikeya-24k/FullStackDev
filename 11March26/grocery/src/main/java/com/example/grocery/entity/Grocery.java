package com.example.grocery.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Grocery {   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;

    private String name;
    private int total;
    private double gst;
    private double grandTotal;
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
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public double getGst() {
        return gst;
    }
    public void setGst(double gst) {
        this.gst = gst;
    }
    public double getGrandTotal() {
        return grandTotal;
    }
    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }
      
}
