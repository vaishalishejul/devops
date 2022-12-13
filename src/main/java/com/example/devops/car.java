package com.example.devops;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class car {
    @GetMapping("/mycar")
    public String getData() {
        return "Please book your  car, Choose Your Fav car celerio ";
    }
}