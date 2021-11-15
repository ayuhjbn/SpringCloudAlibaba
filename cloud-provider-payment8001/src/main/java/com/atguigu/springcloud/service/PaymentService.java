package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author: ztf
 * @program: cloud2020
 * @description: 支付逻辑层
 * @create: 2021-11-10 16:11
 **/
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
