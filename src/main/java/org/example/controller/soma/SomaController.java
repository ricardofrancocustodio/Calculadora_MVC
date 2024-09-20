package org.example.controller.soma;

import org.example.controller.OperacaoMatematica;
import org.example.service.ValidacaoService;
import org.example.service.soma.SomaService;

public class SomaController implements OperacaoMatematica {
    private final SomaService somaService;
    private final ValidacaoService validacaoSomaService;


    public SomaController(SomaService somaService, ValidacaoService validacaoSomaService){
         this.somaService = somaService;
         this.validacaoSomaService =  validacaoSomaService;
    }

    @Override
    public Integer calcular(Integer number_1, Integer number_2){
        validacaoSomaService.checkIfIntegers(number_1, number_2);
        return somaService.soma(number_1, number_2);
    }


}
