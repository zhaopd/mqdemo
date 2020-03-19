package com.example.mqdemo;

import com.example.mqdemo.config.RabbitmqConfig;
import com.example.mqdemo.utils.RabbitmqMessageSend;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MqdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MqdemoApplication.class, args);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RabbitmqConfig.class);
        RabbitmqMessageSend bean = context.getBean(RabbitmqMessageSend.class);
        bean.sendMessage();
        context.close();
    }

}
