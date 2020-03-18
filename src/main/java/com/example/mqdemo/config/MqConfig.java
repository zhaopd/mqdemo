package com.example.mqdemo.config;

import com.rabbitmq.client.ConnectionFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MqConfig {

    @Bean
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory("localhost", 5672);
        //我这里直接在构造方法传入了
        // connectionFactory.setHost();
        // connectionFactory.setPort();
        connectionFactory.setUsername("admin");
        connectionFactory.setPassword("admin");
        connectionFactory.setVirtualHost("testhost");
        // 是否开启消息确认机制
        //connectionFactory.setPublisherConfirms(true);
        return connectionFactory;
    }
}
