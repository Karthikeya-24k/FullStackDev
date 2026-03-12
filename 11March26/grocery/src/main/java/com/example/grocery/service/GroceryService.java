package com.example.grocery.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.grocery.dto.request.GroceryRequest;
import com.example.grocery.dto.response.GroceryResponse;
import com.example.grocery.entity.Grocery;
import com.example.grocery.repository.GroceryRepository;
@Service
public class GroceryService {
    private final GroceryRepository groceryRepository;

    public GroceryService(GroceryRepository groceryRepository) {
        this.groceryRepository = groceryRepository;
    }
    public GroceryResponse processGrocery(GroceryRequest request){
        int total = request.getPrice().stream().mapToInt(Integer::intValue).sum();
        double gst = (double)(18.0/100)*total;
        double grandTotal = total+gst;

        Grocery grocery = new Grocery();
        grocery.setName(request.getName());
        grocery.setTotal(total);
        grocery.setGst(gst);
        grocery.setGrandTotal(grandTotal);
        
        groceryRepository.save(grocery);

        return new GroceryResponse(request.getName(),total,gst,grandTotal);
    }
    public List<GroceryResponse>getAllGroceries(){
        return groceryRepository.findAll().stream().map(grocery -> new GroceryResponse(grocery.getName(), grocery.getTotal(), grocery.getGst(), grocery.getGrandTotal())).toList();
    }

}