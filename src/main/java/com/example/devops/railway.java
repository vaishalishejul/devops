package com.example.devops;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class railway {
    @GetMapping("/myrailway")
    public String getData() {
        return "Please book your  ticket";
    }
}