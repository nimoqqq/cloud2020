package com.nimo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: cloud2020
 * @ClassName: PaymentMain8002
 * @description:
 * @author: chuf
 * @create: 2022-03-06 22:36
 **/
@SpringBootApplication
// 服务注册
@EnableEurekaClient
// 服务发现
@EnableDiscoveryClient
public class PaymentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class, args);
    }
}
