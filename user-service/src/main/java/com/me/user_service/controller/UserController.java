package com.me.user_service.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {


    @GetMapping("/{id}")
    public Map<String , Object> getUser(@PathVariable Long id){

        return Map.of(
                "id" , id,
                "username", "Mohamed",
                "phone", "29152075");
    }
}
