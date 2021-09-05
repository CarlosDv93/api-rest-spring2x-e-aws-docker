package br.com.udemy.carlosdv93.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(name = "/")
    public String helloWorld() {
        System.out.println("na raiz do projeto");
        return "Hello World";
    }
}
