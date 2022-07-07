package com.example.pgdemo1.controller;

import com.example.pgdemo1.services.GreetingService;
import org.springframework.stereotype.Controller;

import javax.persistence.criteria.CriteriaBuilder;

@Controller
public class InjectionController {

    private final GreetingService greetingService;


    public InjectionController (GreetingService greetingService){

        this.greetingService = greetingService;

    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
