package com.example.mqdemo.utils;

import com.rabbitmq.client.*;

import java.io.IOException;

public class Producer {

    public static void getMessage() throws Exception {
        Connection connection = ConnectionUtils.getConnection();
        Channel channel = connection.createChannel();
        DefaultConsumer deliverCallback = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                System.out.println(new String(body, "UTF-8"));
            }
        };
        channel.basicConsume(ConnectionUtils.QUEUE_NAME, deliverCallback);
    }
}
