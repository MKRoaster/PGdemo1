package com.example.pgdemo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestRequestController {

    @RequestMapping("/hello")
    public String hello(Model model){

        model.addAttribute("variable", "value");

        return "hello";

    }

}
