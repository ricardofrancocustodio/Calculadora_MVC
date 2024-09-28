package org.example.service.soma;

import org.example.config.security.RandomNumber;
import org.example.model.operations.OperationModel;
import org.example.repository.soma.SomaRepository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SomaService {
    private Integer number1;
    private Integer number2;

    private final int randomId = RandomNumber.getNumber();
    private SomaRepository somaRepository;
    public SomaService(SomaRepository somaRepository) {
        this.somaRepository = somaRepository;
    }

    public Integer soma(Integer numberOne, Integer numberTwo){
        int result = numberOne + numberTwo;

        OperationModel operation = new OperationModel(randomId, "soma", numberOne, numberTwo, result);
        try {
            somaRepository.save(operation);  // Salva a operação no banco
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
