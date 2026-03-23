package com.example.billing.services;

import org.springframework.stereotype.Service;

import com.example.billing.dto.request.ProductRequest;
import com.example.billing.entity.BillsEntity;
import com.example.billing.entity.ProductEntity;
import com.example.billing.repository.BillsRepository;
import com.example.billing.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final BillsRepository billsRepository;

    public ProductService(ProductRepository productRepository,
                          BillsRepository billsRepository) {
        this.productRepository = productRepository;
        this.billsRepository = billsRepository;
    }

    public ProductEntity createProduct(Long billId, ProductRequest request) {

        BillsEntity bill = billsRepository.findById(billId)
                .orElseThrow(() -> new RuntimeException("Bill not found"));

        ProductEntity product = new ProductEntity();

        product.setBillsEntity(bill);
        product.setProdName(request.getProdname());
        product.setProdQuantity(request.getProdQuantity());
        product.setProdMrp(request.getProdMrp());
        product.setProdTax(request.getProdTax());

        double total = request.getProdMrp() * request.getProdQuantity();
        product.setTotalAmt(total + request.getProdTax());

        return productRepository.save(product);
    }
}