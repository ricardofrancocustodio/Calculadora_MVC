package org.example.controller.subtracao;

import org.example.controller.OperacaoMatematica;
import org.example.service.ValidacaoService;
import org.example.service.subtracao.SubtracaoService;

public class SubtracaoController implements OperacaoMatematica {
    private final SubtracaoService subtracaoService;
    private final ValidacaoService validacaoService;


    public SubtracaoController(SubtracaoService subtracaoService, ValidacaoService validacaoService){
        this.subtracaoService = subtracaoService;
        this.validacaoService =  validacaoService;
    }

    @Override
    public Integer calcular(Integer number_1, Integer number_2){
        validacaoService.checkIfIntegers(number_1, number_2);
        return subtracaoService.subtracao(number_1, number_2);
    }
}
