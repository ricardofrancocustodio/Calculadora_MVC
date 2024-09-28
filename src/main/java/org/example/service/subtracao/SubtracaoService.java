package org.example.service.subtracao;

import org.example.config.security.RandomNumber;
import org.example.model.operations.OperationModel;
import org.example.repository.subtracao.SubtracaoRepository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SubtracaoService {
    private Integer number1;
    private Integer number2;

    private SubtracaoRepository subtracaoRepository;
    private final int randomId = RandomNumber.getNumber();

    public SubtracaoService(SubtracaoRepository subtracaoRepository) {
        this.subtracaoRepository = subtracaoRepository;
    }

    public Integer subtracao(Integer numberOne, Integer numberTwo){

       int result = numberOne - numberTwo;

        OperationModel operation = new OperationModel(randomId, "subtracao", numberOne, numberTwo, result);
        try {
            subtracaoRepository.save(operation);  // Salva a operação no banco
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
