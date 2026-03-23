package com.example.billing.dto.response;

public class ProductResponse {
    private String prodName;
    private Integer prodQuantity;
    private Double prodMrp;
    private Double prodTax;
    private Double total;
    
    public ProductResponse(String prodName, Integer prodQuantity, Double prodMrp, Double prodTax, Double total) {
        this.prodName = prodName;
        this.prodQuantity = prodQuantity;
        this.prodMrp = prodMrp;
        this.prodTax = prodTax;
        this.total = total;
    }
    public String getProdName() {
        return prodName;
    }
    public void setProdName(String prodName) {
        this.prodName = prodName;
    }
    public Integer getProdQuantity() {
        return prodQuantity;
    }
    public void setProdQuantity(Integer prodQuantity) {
        this.prodQuantity = prodQuantity;
    }
    public Double getProdMrp() {
        return prodMrp;
    }
    public void setProdMrp(Double prodMrp) {
        this.prodMrp = prodMrp;
    }
    public Double getProdTax() {
        return prodTax;
    }
    public void setProdTax(Double prodTax) {
        this.prodTax = prodTax;
    }
    public Double getTotal() {
        return total;
    }
    public void setTotal(Double total) {
        this.total = total;
    }

}
