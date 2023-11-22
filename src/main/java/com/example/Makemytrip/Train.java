package com.example.Makemytrip;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class Train {
    @GetMapping("/Train")
public String getData() {return "Welcome to Goibibo .Please book your Train Ticket at 80% Discount" ;}
}

