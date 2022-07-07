package com.example.pgdemo1.controller;

import com.example.pgdemo1.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
