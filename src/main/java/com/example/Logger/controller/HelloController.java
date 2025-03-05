package com.example.Logger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
    @GetMapping("/query")
    public String sayHelloWithQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

}
