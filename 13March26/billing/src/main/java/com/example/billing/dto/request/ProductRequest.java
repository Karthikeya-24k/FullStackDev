package com.example.billing.dto.request;

public class ProductRequest {
    private String prodname;

    private int prodQuantity;
    private double prodMrp;
    private double prodTax;
    private double totalAmt;
    public String getProdname() {
        return prodname;
    }
    public void setProdname(String prodname) {
        this.prodname = prodname;
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
