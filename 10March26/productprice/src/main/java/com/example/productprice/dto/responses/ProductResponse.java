package com.example.productprice.dto.responses;

public class ProductResponse {
    private int id;
    private String name;
    
    private int total;
    private double gst;
    private double netTotal;
    public ProductResponse(int id, String name, int total, double gst, double netTotal) {
        this.id = id;
        this.name = name;
        this.total = total;
        this.gst = gst;
        this.netTotal = netTotal;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
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
    public double getNetTotal() {
        return netTotal;
    }
    public void setNetTotal(double netTotal) {
        this.netTotal = netTotal;
    }
}
