package com.example.pgdemo1;

import com.example.pgdemo1.controller.InjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PGdemo1Application {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(PGdemo1Application.class, args);

        InjectionController injectionController = (InjectionController) ctx.getBean("injectionController");

        String methodSayHello = injectionController.sayHello();

        System.out.println(methodSayHello);

     }

}
