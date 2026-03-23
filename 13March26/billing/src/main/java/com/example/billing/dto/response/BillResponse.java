package com.example.billing.dto.response;

public class BillResponse {

    private Long billId;
    private Long userId;
    private String userName;

    private ProductResponse product;

    public BillResponse(Long billId, Long userId, String userName, ProductResponse product) {
        this.billId = billId;
        this.userId = userId;
        this.userName = userName;
        this.product = product;
    }

    public Long getBillId() {
        return billId;
    }

    public Long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public ProductResponse getProduct() {
        return product;
    }
}