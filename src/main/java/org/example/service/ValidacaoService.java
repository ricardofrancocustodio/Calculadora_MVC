package org.example.service;

public class ValidacaoService {
    private Integer number_1;
    private Integer number_2;

    public ValidacaoService(Integer number_1, Integer number_2){
        this.number_1 = number_1;
        this.number_2 =  number_2;
    }

    public boolean checkIfIntegers(Integer number_1, Integer number_2){
        if(number_1 == null || number_2 == null){
            throw new IllegalArgumentException("Numbers cannor be null");
        }
        return true;
    }

    public boolean divisionByZero(Integer number_2){
        if(number_2 == 0){
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return true;
    }



}
