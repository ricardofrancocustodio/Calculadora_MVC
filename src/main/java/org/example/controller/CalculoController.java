package org.example.controller;


import java.util.Map;

public class CalculoController {
    private final Map<String, OperacaoMatematica> operacoes;


    public CalculoController(Map<String, OperacaoMatematica> operacoes){
        this.operacoes = operacoes;
    }

    public Integer calcular(String operacao, Integer number_1, Integer number_2){
        OperacaoMatematica operacaoMatematica = operacoes.get(operacao);

        if(operacaoMatematica == null){
            throw new IllegalArgumentException("Numbers cannor be null");
        }

        return operacaoMatematica.calcular(number_1, number_2);
    }

}
