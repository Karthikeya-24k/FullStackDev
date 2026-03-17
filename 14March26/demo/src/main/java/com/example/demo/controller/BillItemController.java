package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ApiResponse;
import com.example.demo.dto.BillItemRequest;
import com.example.demo.dto.BillItemResponse;
import com.example.demo.service.BillItemService;

@RestController
@RequestMapping("/billitemconnection")

public class BillItemController {
    private final BillItemService billItemService;

    public BillItemController(BillItemService billItemService) {
        this.billItemService = billItemService;
    }

    @PostMapping
    public ApiResponse<BillItemResponse> billAndProducts(@RequestBody BillItemRequest req){
        BillItemResponse response = billItemService.getTheBillByItem(
            req
        );
        return new ApiResponse<>("Success",response);
    }
    @GetMapping("list/{id}")
        public ApiResponse<List<BillItemResponse>> getItems(@PathVariable Long billId){
        List<BillItemResponse> responses = billItemService.getItemsbyBill(billId);
        return new ApiResponse<List<BillItemResponse>>("success", responses);
    }

    }
