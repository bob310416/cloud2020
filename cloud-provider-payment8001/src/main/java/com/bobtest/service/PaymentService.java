package com.bobtest.service;

import entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * Author: bob
 * Date: 2020/3/29 - 0:20
 */

public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
