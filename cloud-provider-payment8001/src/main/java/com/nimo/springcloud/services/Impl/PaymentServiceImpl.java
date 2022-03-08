package com.nimo.springcloud.services.Impl;

import com.nimo.springcloud.dao.PaymentDao;
import com.nimo.springcloud.entities.Payment;
import com.nimo.springcloud.services.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: cloud2020
 * @ClassName: PaymentServiceImpl
 * @description:
 * @author: chuf
 * @create: 2022-03-06 16:01
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
