package com.nimo.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: cloud2020
 * @ClassName: FeignConfig
 * @description:
 * @author: chuf
 * @create: 2022-03-07 18:17
 * OpenFeign日志增强
 **/
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
