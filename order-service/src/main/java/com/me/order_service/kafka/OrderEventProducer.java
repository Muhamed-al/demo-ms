package com.me.order_service.kafka;


import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderEventProducer {

    private static final String TOPIC = "order-created";
    private final KafkaTemplate<String , String> kafkaTemplate;

    public OrderEventProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }


    public void sendMsg(String msg ){
        kafkaTemplate.send(TOPIC , msg);
        System.out.println("Message envoyé à Kafka " + msg);
    }
}
