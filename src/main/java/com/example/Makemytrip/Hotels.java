package com.example.Makemytrip;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Hotels {
    @GetMapping("/Hotels")
    public String getData() {return "Welcome to MMT .Please book your flights at 40% Discount" ;}
}
