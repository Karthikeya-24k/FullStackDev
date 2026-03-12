package com.example.grocery.dto.response;

public class GroceryResponse {
    private String name;
    private int total;
    private double gst;
    private double grandTotal;
    public GroceryResponse(String name, int total, double gst, double grandTotal) {
        this.name = name;
        this.total = total;
        this.gst = gst;
        this.grandTotal = grandTotal;
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
