package com.example.pgdemo1.controller;

import org.springframework.stereotype.Controller;

@Controller
public class InjectionController {

    public String sayHello(){

        System.out.println("Method saying hello");

        return "Method returning String";

    }
}
