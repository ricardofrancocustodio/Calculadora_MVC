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
    public Integer calcular(Integer number_1, Integer number_2){
        validacaoService.checkIfIntegers(number_1, number_2);
        return multiplicacaoService.multiplicacao(number_1, number_2);
    }
}
