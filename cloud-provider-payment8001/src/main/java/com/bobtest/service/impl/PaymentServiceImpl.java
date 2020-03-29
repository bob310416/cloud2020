package com.bobtest.service.impl;

import com.bobtest.dao.PaymentDao;
import com.bobtest.service.PaymentService;
import entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Author: bob
 * Date: 2020/3/29 - 0:21
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
