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
    public Integer calcular(Integer numberOne, Integer numberTwo){
        validacaoService.checkIfIntegers(numberOne, numberTwo);
        return subtracaoService.subtracao(numberOne, numberTwo);
    }
}
