package org.example.service;

public class ValidacaoService {
    private final Integer number1;
    private final Integer number2;

    public ValidacaoService(Integer numberOne, Integer numberTwo){
        this.number1 = numberOne;
        this.number2 =  numberTwo;

        checkIfIntegers(number1, number2);
    }

    public boolean checkIfIntegers(Integer numberOne, Integer numberTwo){
        if(numberOne == null || numberTwo == null){
            throw new IllegalArgumentException("Numbers cannor be null");
        }
        return true;
    }

}
