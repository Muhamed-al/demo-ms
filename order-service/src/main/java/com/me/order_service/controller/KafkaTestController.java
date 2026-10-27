package com.me.order_service.controller;


import com.me.order_service.kafka.OrderEventProducer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class KafkaTestController {

    private final  OrderEventProducer orderEventProducer;

    public KafkaTestController(OrderEventProducer orderEventProducer) {
        this.orderEventProducer = orderEventProducer;
    }

    @GetMapping("/publish")
    public String saveOrder(){
        orderEventProducer.sendMsg("Message Envoyé à Kafka ");
        return "Commande crée avec success";
    }
}
