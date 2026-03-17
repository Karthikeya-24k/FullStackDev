package com.example.demo.dto;

import lombok.Data;

@Data
public class BillItemRequest {
    private Long billid;
    private Long prodid;
    private Integer qty;
    
}
