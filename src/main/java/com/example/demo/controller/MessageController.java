package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.MessageConfig;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequiredArgsConstructor
public class MessageController {
    private final MessageConfig messageConfig;

    @GetMapping("/testmessages")
    public String getTestMessage() {
        return "test " + messageConfig.getMessage();
    }
}