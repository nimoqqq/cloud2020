package com.nimo.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @program: cloud2020
 * @ClassName: PaymentFallbackService
 * @description:
 * @author: chuf
 * @create: 2022-03-07 23:54
 **/
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
