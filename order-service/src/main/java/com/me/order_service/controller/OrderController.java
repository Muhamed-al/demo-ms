package com.me.order_service.controller;


import com.me.order_service.clients.UserClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final UserClient userClient;

    public OrderController(UserClient userClient) {
        this.userClient = userClient;
    }


    @GetMapping("/{id}")
    public Map<String, Object> getOrder(@PathVariable Long id){

        Map<String, Object> user = userClient.getUser(1L);

        Map<String, Object> order = Map.of(
                "id", id,
                "Total" , 329.9,
                "status", "Pending"
        );
        return Map.of(
                "user" , user,
                "order", order
        );
    }
}
