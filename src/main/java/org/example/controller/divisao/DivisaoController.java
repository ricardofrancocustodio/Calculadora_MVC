package org.example.controller.divisao;

import org.example.controller.OperacaoMatematica;
import org.example.service.ValidacaoService;
import org.example.service.divisao.DivisaoService;

public class DivisaoController implements OperacaoMatematica {
    private final DivisaoService divisaoService;
    private final ValidacaoService validacaoService;


    public DivisaoController(DivisaoService divisaoService, ValidacaoService validacaoService){
        this.divisaoService = divisaoService;
        this.validacaoService =  validacaoService;
    }

    @Override
    public Integer calcular(Integer number_1, Integer number_2){
        validacaoService.checkIfIntegers(number_1, number_2);
        validacaoService.divisionByZero(number_2);
        return divisaoService.divisao(number_1, number_2);
    }
}
