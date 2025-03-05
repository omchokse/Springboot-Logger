package com.example.Logger.controller;

import com.example.Logger.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/param/{name}")
    public String sayHelloWithPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
    @PostMapping("/post")
    public String sayHelloWithPost(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
    @PutMapping("/put/{firstName}")
    public String sayHelloWithPut(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
