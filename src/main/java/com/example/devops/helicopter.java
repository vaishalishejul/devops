package com.example.devops;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helicopter {
    @GetMapping("/myhelicopter")
    public String getData() {
        return "Please book your  ticket";
    }
}