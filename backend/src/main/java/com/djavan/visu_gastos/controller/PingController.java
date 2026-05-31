package com.djavan.visu_gastos.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class PingController {
    
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}
