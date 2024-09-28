package org.example.service.divisao;

import org.example.config.security.RandomNumber;
import org.example.model.operations.OperationModel;
import org.example.repository.divisao.DivisionRepository;
import java.sql.SQLException;

public class DivisaoService {

    private final int randomId = RandomNumber.getNumber();
    private final DivisionRepository divisionRepository;
    public DivisaoService(DivisionRepository divisionRepository){
        this.divisionRepository =  divisionRepository;
    }

    public Integer divisao(Integer numberOne, Integer numberTwo){

        int result = numberOne / numberTwo;

        OperationModel operation = new OperationModel(randomId, "divisao", numberOne, numberTwo, result);
        try {
            divisionRepository.save(operation);  // Salva a operação no banco
        } catch (SQLException e) {
            e.printStackTrace();  // Lida com possíveis erros de SQL
        }

        return result;
    }

}
