package com.edigest.journalApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Healthcheck {

    @GetMapping("/healthCheck")
    public  String healthcheck(){
        return "ok";
    }
}
