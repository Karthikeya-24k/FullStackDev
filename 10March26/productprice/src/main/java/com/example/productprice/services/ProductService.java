package com.example.productprice.services;

import org.springframework.stereotype.Service;

import com.example.productprice.dto.requests.ProductRequests;
import com.example.productprice.dto.responses.ProductResponse;

@Service
public class ProductService {
    public ProductResponse calProductResponse(ProductRequests req){
        int total = 0;
        total = req.getPrice1()+req.getPrice2()+req.getPrice3()+req.getPrice4()+req.getPrice5()+req.getPrice6()+req.getPrice7()+req.getPrice8()+req.getPrice9()+req.getPrice10();
        double gst = 0;
        gst = (18/100.0)*total;
        double netTotal = total+gst;
        return new ProductResponse(req.getId(), req.getCustomerName(), total, gst, netTotal);
    }
}
