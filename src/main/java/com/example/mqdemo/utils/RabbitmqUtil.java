package com.example.mqdemo.utils;


import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;

/**
 * 需要咨询java高级VIP课程的同学可以加安其拉老师的QQ：3164703201
 * 需要往期视频资料的同学可以加木兰老师的QQ:2746251334
 * author：鲁班学院-商鞅老师
 */
@Component
public class RabbitmqUtil {




    @RabbitListener(queues = "testQueue")
    public void get(Message message,String string) throws Exception{
        System.out.println(new String(message.getBody(),"UTF-8"));
        System.out.println("消费者1");
    }


    @RabbitListener(queues = "testQueue")
    public  void  get1(String message) throws UnsupportedEncodingException {
        System.out.println(message);
        System.out.println("消费者2");
    }
}
