package com.example.demo.dto;

import lombok.Data;

@Data
public class BillItemResponse {
    private Long id;
    private Long billid;
    private Long prodid;
    private Integer qty;
    private Double prodmrp;
    private Double prodtax;
    private Double total;
}
