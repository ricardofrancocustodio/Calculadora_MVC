package org.example.controller.multiplicacao;

import org.example.controller.OperacaoMatematica;
import org.example.service.ValidacaoService;
import org.example.service.multiplicacao.MultiplicacaoService;

public class MultiplicacaoController implements OperacaoMatematica {
    private final MultiplicacaoService multiplicacaoService;
    private final ValidacaoService validacaoService;


    public MultiplicacaoController(MultiplicacaoService multiplicacaoService, ValidacaoService validacaoService){
        this.multiplicacaoService = multiplicacaoService;
        this.validacaoService =  validacaoService;
    }

    @Override
    public Integer calcular(Integer numberOne, Integer numberTwo){
        validacaoService.checkIfIntegers(numberOne, numberTwo);
        return multiplicacaoService.multiplicacao(numberOne, numberTwo);
    }
}
