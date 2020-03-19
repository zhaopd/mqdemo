package com.example.mqdemo.controller;

import com.example.mqdemo.utils.RabbitmqMessageSend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 需要咨询java高级VIP课程的同学可以加安其拉老师的QQ：3164703201
 * 需要往期视频资料的同学可以加木兰老师的QQ:2746251334
 * author：鲁班学院-商鞅老师
 */
@RestController
public class OrderController {

    @Autowired
    RabbitmqMessageSend rabbitmqMessageSend;

    @RequestMapping("/order.do")
    public  Object order(String message,String rouingKey,String name){
        rabbitmqMessageSend.sendMessage();

        return null;
    }

}
