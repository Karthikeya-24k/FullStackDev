package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.dto.BillItemRequest;
import com.example.demo.dto.BillItemResponse;
import com.example.demo.entity.BillIItemEntity;
import com.example.demo.entity.BillsEntity;
import com.example.demo.entity.ProductEntity;
import com.example.demo.repository.BillItemRepository;
import com.example.demo.repository.BillRepository;
import com.example.demo.repository.ProductRepository;

@Service
public class BillItemService {
    private final BillItemRepository billItemRepository;
    private final BillRepository billRepository;
    private final ProductRepository productRepository;
    public BillItemService(BillItemRepository billItemRepository, BillRepository billRepository,
            ProductRepository productRepository) {
        this.billItemRepository = billItemRepository;
        this.billRepository = billRepository;
        this.productRepository = productRepository;
    }
    
    public BillItemResponse getTheBillByItem(BillItemRequest request){
        BillsEntity entity = billRepository.findById(request.getBillid()).orElseThrow();
        ProductEntity entity2 = productRepository.findById(request.getProdid()).orElseThrow();
        
        double price = entity2.getProdMrp();
        double tax = entity2.getProdTax();

        double total = request.getQty()*price;
        total = total + (total * tax / 100);
        
        BillIItemEntity itemEntity = new BillIItemEntity();
        itemEntity.setQty(request.getQty());
        itemEntity.setPrice(price);
        itemEntity.setBillsEntity(entity);
        itemEntity.setProductEntity(entity2);
        itemEntity.setTax(tax);
        itemEntity.setTotal(total)
        ;
        BillIItemEntity saved = billItemRepository.save(itemEntity);
        BillItemResponse setItem = new BillItemResponse();
        
        setItem.setId(saved.getId());
        setItem.setBillid(saved.getProductEntity().getBill().getId());
        setItem.setProdid(saved.getProductEntity().getId());
        setItem.setProdmrp(price);
        setItem.setProdtax(tax);
        setItem.setQty(request.getQty());
        setItem.setTotal(total);
        return setItem;

    }
    public List<BillItemResponse> getItemsbyBill(Long billid){
        List<BillIItemEntity> items = billItemRepository.findByBillsEntityId(billid);
        return items.stream().map(
            item -> {
                BillItemResponse res = new BillItemResponse();
                res.setBillid(item.getBillsEntity().getId());
                 res.setId(item.getId());
                res.setProdmrp(item.getPrice());
                res.setProdid(item.getProductEntity().getId());
                res.setQty(item.getQty());
                res.setProdtax(item.getTax());
                res.setTotal(item.getTotal());
                return res;
            }
        ).collect(Collectors.toList());

    }
}
