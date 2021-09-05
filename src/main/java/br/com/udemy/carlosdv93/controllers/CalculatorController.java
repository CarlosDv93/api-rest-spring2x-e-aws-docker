package br.com.udemy.carlosdv93.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @RequestMapping("/calculator")
    public String hello() {
        System.out.println("Entrou no calculator");
        return "Hello World calculator";
    }

    @RequestMapping("/sum/{number1}/{number2}")
    public Double sum(@PathVariable(name = "number1") Double num1, @PathVariable(name = "number2") Double num2) {
        System.out.println("Entrou no sum");
        return num1+num2;
    }

    @RequestMapping(value= "/sub/{number1}/{number2}", method = RequestMethod.GET)
    public Double subs(@PathVariable(name = "number1") Double num1, @PathVariable(name = "number2") Double num2) {
        return 20D;
    }
}
