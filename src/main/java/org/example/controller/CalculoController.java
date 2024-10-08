package org.example.controller;


import java.util.Map;

public class CalculoController {
    private final Map<String, OperacaoMatematica> operacoes;


    public CalculoController(Map<String, OperacaoMatematica> operacoes){
        this.operacoes = operacoes;
    }

    public Integer calcular(String operacao, int numberOne, int numberTwo){
        OperacaoMatematica operacaoMatematica = operacoes.get(operacao);

        if (!operacao.equals("soma") && !operacao.equals("subtracao") && !operacao.equals("multiplicacao") && !operacao.equals("divisao")) {
            throw new IllegalArgumentException("Operação inválida");
        }

        if(operacaoMatematica == null){
            throw new IllegalArgumentException("Numbers cannor be null");
        }

        return operacaoMatematica.calcular(numberOne, numberTwo);
    }

}
