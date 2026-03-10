package com.example.productprice.dto.responses;

public class ApiResponse {
    private ProductResponse data;

    public ApiResponse(ProductResponse data) {
        this.data = data;
    }

    public ProductResponse getData() {
        return data;
    }

    public void setData(ProductResponse data) {
        this.data = data;
    }
}
