package com.example.cloudproviderpayment8001.service;

import com.example.cloudproviderpayment8001.entity.Payment;
import com.example.cloudproviderpayment8001.mapper.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    public int create(Payment payment) {
        return paymentMapper.insert(payment);
    }
}
