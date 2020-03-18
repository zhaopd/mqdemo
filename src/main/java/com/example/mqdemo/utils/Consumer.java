package com.example.mqdemo.utils;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

public class Consumer {

    public static void sendByExchange(String message) throws Exception{
        Connection connection = ConnectionUtils.getConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare(ConnectionUtils.EXCHANGE_NAME, true, false, false, null);
        channel.exchangeDeclare(ConnectionUtils.EXCHANGE_NAME, "fanout");
        channel.queueBind(ConnectionUtils.QUEUE_NAME, ConnectionUtils.EXCHANGE_NAME, "");
        channel.basicPublish(ConnectionUtils.EXCHANGE_NAME, "", null, message.getBytes());
        System.out.println("发送的消息为:"+message);
        channel.close();
        connection.close();
    }
}
