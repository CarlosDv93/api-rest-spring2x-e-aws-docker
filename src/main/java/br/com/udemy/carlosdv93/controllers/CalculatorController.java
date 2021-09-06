package br.com.udemy.carlosdv93.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    //Nome usado no curso MathController

    @RequestMapping("/sum/{number1}/{number2}")
    public Double sum(@PathVariable(name = "number1") String num1, @PathVariable(name = "number2") String num2) throws Exception {
        System.out.println("Entrou no sum");
        if(!isNumeric(num1) || !isNumeric(num2)) {
            throw new Exception("Não é um numero!");
        }

        return convertToDouble(num1) + convertToDouble(num2);
    }

    @RequestMapping(value= "/sub/{number1}/{number2}", method = RequestMethod.GET)
    public Double subs(@PathVariable(name = "number1") String num1, @PathVariable(name = "number2") String num2) throws Exception {
        if(!isNumeric(num1) || !isNumeric(num2)){
            throw new Exception("Não é um numero!");
        }

        return convertToDouble(num1) - convertToDouble(num2);
    }

    private Double convertToDouble(String strNum) {
        if(strNum == null) return 0D;
        String number = strNum.replaceAll(",", ".");

        if(isNumeric(number)) return Double.parseDouble(number);

        return 0D;
    }

    private boolean isNumeric(String strNumber) {
        if(strNumber == null) return false;

        String number = strNumber.replaceAll(",", ".");
        return number.matches("[+-]?[0-9]+\\.?[0-9]+");
    }
}
