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
    public Integer calcular(Integer numberOne, Integer numberTwo){
        validacaoService.checkIfIntegers(numberOne, numberTwo);
        return divisaoService.divisao(numberOne, numberTwo);
    }
}
