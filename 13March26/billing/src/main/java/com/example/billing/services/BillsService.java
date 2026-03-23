package com.example.billing.services;

import org.springframework.stereotype.Service;

import com.example.billing.entity.BillsEntity;
import com.example.billing.entity.UserEntity;
import com.example.billing.repository.BillsRepository;
import com.example.billing.repository.UserRepository;

@Service
public class BillsService {

    private final BillsRepository billsRepository;
    private final UserRepository userRepository;

    public BillsService(BillsRepository billsRepository,
                        UserRepository userRepository) {
        this.billsRepository = billsRepository;
        this.userRepository = userRepository;
    }

    public BillsEntity createBill(Long userId) {

        UserEntity user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        BillsEntity bill = new BillsEntity();
        bill.setUserEntity(user);

        return billsRepository.save(bill);
    }
}