package org.example.service.soma;

import org.example.model.operations.OperationModel;
import org.example.repository.soma.SomaRepository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SomaService {
    private Integer number_1;
    private Integer number_2;

    private SomaRepository somaRepository;
    public SomaService(SomaRepository somaRepository) {
        this.somaRepository = somaRepository;
    }

    public SomaService(Integer number_1, Integer number_2){
        this.number_1 =  number_1;
        this.number_2 =  number_2;

    }

    public Integer soma(Integer number_1, Integer number_2){
        int result = number_1 + number_2;

        OperationModel operation = new OperationModel(2, "soma", number_1, number_2, result);
        try {
            somaRepository.save(operation);  // Salva a operação no banco
        } catch (SQLException e) {
            e.printStackTrace();  // Lida com possíveis erros de SQL
        }

        return result;
    }

    private Integer getNumber_1(){
        return number_1;
    }

    private Integer getNumber_2(){
        return number_2;
    }

    public List<Integer> addNumbersToList(){
        List<Integer> listNumbers =  new ArrayList<>();
        listNumbers.add(getNumber_1());
        listNumbers.add(getNumber_2());

        return listNumbers;
    }


}
