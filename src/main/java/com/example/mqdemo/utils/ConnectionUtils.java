package com.example.mqdemo.utils;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class ConnectionUtils {

    public static final String QUEUE_NAME = "testQueue";

    public static final String EXCHANGE_NAME = "exchange";

    public static Connection getConnection() throws Exception {
        //创建一个连接工厂
        ConnectionFactory connectionFactory = new ConnectionFactory();
        //设置rabbitmq 服务端所在地址 我这里在本地就是本地
        connectionFactory.setHost("172.16.0.196");
        //设置端口号，连接用户名，虚拟地址等
        connectionFactory.setPort(5672);
        connectionFactory.setUsername("android");
        connectionFactory.setPassword("android");
        connectionFactory.setVirtualHost("mobile");
        return connectionFactory.newConnection();
    }
}

