package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MessageController {
    @GetMapping("/testmessages")
    public String getTestMessage() {
        return "test message";
    }
}