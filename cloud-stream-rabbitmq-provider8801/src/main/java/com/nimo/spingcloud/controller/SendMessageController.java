package com.nimo.spingcloud.controller;

import com.nimo.spingcloud.services.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: cloud2020
 * @ClassName: SendMessageController
 * @description:
 * @author: chuf
 * @create: 2022-03-08 16:22
 **/
@RestController
public class SendMessageController {
    @Resource
    private IMessageProvider messageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage() {
        return messageProvider.send();
    }

}