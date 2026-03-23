package com.example.billing.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "bill_id")
    private BillsEntity billsEntity;

    @Column(name = "prod_name")
    private String prodName;
    @Column(name = "prod_qty")
    private int prodQuantity;
    @Column(name = "prod_mrp")
    private double prodMrp;
    @Column(name = "prod_tax")
    private double prodTax;
    @Column(name = "tot_amt")
    private double totalAmt;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public BillsEntity getBillsEntity() {
        return billsEntity;
    }
    public void setBillsEntity(BillsEntity billsEntity) {
        this.billsEntity = billsEntity;
    }
    public String getProdName() {
        return prodName;
    }
    public void setProdName(String prodName) {
        this.prodName = prodName;
    }
    public int getProdQuantity() {
        return prodQuantity;
    }
    public void setProdQuantity(int prodQuantity) {
        this.prodQuantity = prodQuantity;
    }
    public double getProdMrp() {
        return prodMrp;
    }
    public void setProdMrp(double prodMrp) {
        this.prodMrp = prodMrp;
    }
    public double getProdTax() {
        return prodTax;
    }
    public void setProdTax(double prodTax) {
        this.prodTax = prodTax;
    }
    public double getTotalAmt() {
        return totalAmt;
    }
    public void setTotalAmt(double totalAmt) {
        this.totalAmt = totalAmt;
    }
    

}
