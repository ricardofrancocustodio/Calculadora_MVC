package test.example.service;

import org.example.model.operations.OperationModel;
import org.example.repository.divisao.DivisionRepository;
import org.example.repository.soma.SomaRepository;
import org.example.service.divisao.DivisaoService;
import org.example.service.soma.SomaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DivisionServiceTest {

    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/calculadora_mvc", "root", "");
    public DivisaoService divisaoService;
    public DivisionRepository divisionRepository = new DivisionRepository(connection);

    public DivisionServiceTest() throws SQLException {
    }

    @BeforeEach
    void setup(){
        divisionRepository = Mockito.mock(divisionRepository.getClass());
        divisaoService =  new DivisaoService(divisionRepository);
    }

    @Tag("smoke")
    @Test
    void shouldDivide()  throws SQLException {
        Integer result = divisaoService.divisao(3, 3);
        Assertions.assertEquals(1, result);
        Mockito.verify(divisionRepository).save(Mockito.any(OperationModel.class));
    }

    @Tag("regression")
    @ParameterizedTest
    @CsvSource({
            "3, 3, 0",
            "3, 3, 6",
            "3, 3, 9",
            "3, 3, -1"
    })
    void shouldNotReturnInvalidDivisionOperation(int numberOne, int numberTwo, int invalidResult){
        Integer result = divisaoService.divisao(numberOne, numberTwo);
        Assertions.assertNotEquals(invalidResult, result);

    }

    @Tag("regression")
    @Test
    void shouldNotSubtract(){
        Integer result = divisaoService.divisao(3, 3);
        Assertions.assertNotEquals(0, result);

    }

}