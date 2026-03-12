package com.example.grocery.dto.request;

import java.util.List;

public class GroceryRequest {
    private String name;
    private List<Integer> price;
    
    public GroceryRequest(String name, List<Integer> price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Integer> getPrice() {
        return price;
    }
    public void setPrice(List<Integer> price) {
        this.price = price;
    }
    
}
