package com.skobelev.echo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @GetMapping("/echo")
    public String echo(@RequestParam(name = "msg") String msg) {
        return "Echo: " + msg + " serverTime = " + System.currentTimeMillis();
    }

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello world";
    }
}
