package com.example.productprice.controlers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.productprice.dto.requests.ProductRequests;
import com.example.productprice.dto.responses.ApiResponse;
import com.example.productprice.dto.responses.ProductResponse;
import com.example.productprice.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @PostMapping("/calc")
    public ApiResponse getResult(@RequestBody ProductRequests rq){
        ProductResponse result = productService.calProductResponse(rq);
        return new ApiResponse(result);
    }
}
