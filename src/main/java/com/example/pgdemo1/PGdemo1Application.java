package com.example.pgdemo1;

import com.example.pgdemo1.controller.ConstructorInjectedController;
import com.example.pgdemo1.controller.InjectionController;
import com.example.pgdemo1.controller.PropertyInjectedController;
import com.example.pgdemo1.controller.SetterInjectedController;
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

        System.out.println(" ---------- Property ");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController)  ctx.getBean("propertyInjectedController");

        System.out.println(propertyInjectedController.getGreeting());

        System.out.println(" ---------- Setter ");

        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

        System.out.println(setterInjectedController.getGreeting());

        System.out.println(" ---------- Constructor ");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.getGreeting());

     }

}
