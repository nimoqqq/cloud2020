package com.nimo.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @program: cloud2020
 * @ClassName: PaymentController
 * @description:
 * @author: chuf
 * @create: 2022-03-07 16:20
 **/
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/consul")
    public String paymentConsul() {
        return "springcloud with consul: " + serverPort + "\t   " + UUID.randomUUID().toString();
    }
}