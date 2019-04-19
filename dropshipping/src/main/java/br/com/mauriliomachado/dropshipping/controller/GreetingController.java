package br.com.mauriliomachado.dropshipping.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";

    @Value("${spring.application.region}")
    private String appName;

    @GetMapping("/greeting")
    public String greeting() {
        return new String(String.format(template, appName));
    }
}
