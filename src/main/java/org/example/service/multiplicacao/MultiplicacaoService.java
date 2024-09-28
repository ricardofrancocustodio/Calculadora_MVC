package org.example.service.multiplicacao;


import org.example.config.security.RandomNumber;
import org.example.model.operations.OperationModel;
import org.example.repository.multiplicacao.MultiplicacaoRepository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MultiplicacaoService {

    private Integer number1;
    private Integer number2;

    private final int randomId = RandomNumber.getNumber();
    private MultiplicacaoRepository multiplicacaoRepository;

    public MultiplicacaoService(MultiplicacaoRepository multiplicacaoRepository){
        this.multiplicacaoRepository =  multiplicacaoRepository;
    }

    public MultiplicacaoService(Integer numberOne, Integer numberTwo){
        this.number1 =  numberOne;
        this.number2 =  numberTwo;
    }

    public Integer multiplicacao(Integer numberOne, Integer numberTwo){
        int result = numberOne * numberTwo;

        OperationModel operation = new OperationModel(randomId, "multiplicacao", numberOne, numberTwo, result);
        try {
            multiplicacaoRepository.save(operation);  // Salva a operação no banco
        } catch (SQLException e) {
            e.printStackTrace();  // Lida com possíveis erros de SQL
        }

        return result;
    }

    private Integer getNumber1(){
        return number1;
    }

    private Integer getNumber2(){
        return number2;
    }

    public List<Integer> addNumbersToList(){
        List<Integer> listNumbers =  new ArrayList<>();
        listNumbers.add(getNumber1());
        listNumbers.add(getNumber2());

        return listNumbers;
    }
}
