package com.example.grocery.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.grocery.dto.request.GroceryRequest;
import com.example.grocery.dto.response.ApiResponse;
import com.example.grocery.dto.response.GroceryResponse;
import com.example.grocery.service.GroceryService;

@RestController
@RequestMapping("/groceries")
public class GroceryController {
    private final GroceryService grocerysService;

    public GroceryController(GroceryService grocerysService) {
        this.grocerysService = grocerysService;
    }
    @PostMapping("/calc")
    public ApiResponse<GroceryResponse>getGrocery(@RequestBody GroceryRequest req){
        return new ApiResponse<GroceryResponse>("Success", grocerysService.processGrocery(req) );
    }
    @GetMapping("/result")
    public ApiResponse<List<GroceryResponse>>getAllStudentResponse(){
        List<GroceryResponse> responses = grocerysService.getAllGroceries();
        return new ApiResponse<List<GroceryResponse>>("Success", responses);
        
    }
}
