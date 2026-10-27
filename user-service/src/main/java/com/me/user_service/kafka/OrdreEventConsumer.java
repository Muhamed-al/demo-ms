package com.me.user_service.kafka;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrdreEventConsumer {


    @KafkaListener(topics = "order-created")
    public void receiveMsg(String msg){
        System.out.println("Message recu depuis kafka " + msg);
    }
}
