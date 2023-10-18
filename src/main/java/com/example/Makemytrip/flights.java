package com.example.Makemytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class flights {
    @GetMapping("/flights")
    public String getData() {return "Welcome to Indigo .Please book your flights at 10% Discount" ;}
}


