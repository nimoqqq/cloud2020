package com.nimo.springcloud;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.ZonedDateTime;

/**
 * @program: cloud2020
 * @ClassName: T2
 * @description:
 * @author: chuf
 * @create: 2022-03-08 13:25
 **/
@SpringBootTest
public class T2 {

    @Test
    public void zonedDateTimeTest() {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);
    }
}