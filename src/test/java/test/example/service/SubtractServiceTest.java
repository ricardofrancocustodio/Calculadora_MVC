package test.example.service;

import org.example.model.operations.OperationModel;
import org.example.repository.subtracao.SubtracaoRepository;
import org.example.service.subtracao.SubtracaoService;
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

public class SubtractServiceTest {

    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/calculadora_mvc", "root", "");
    public SubtracaoService subtracaoService;

    public SubtracaoRepository subtracaoRepository = new SubtracaoRepository(connection);

    public SubtractServiceTest() throws SQLException {
    }

    @BeforeEach
    void setup(){
        subtracaoRepository = Mockito.mock(subtracaoRepository.getClass());
        subtracaoService =  new SubtracaoService(subtracaoRepository);
    }
    @Tag("smoke")
    @Test
    void shouldSubtract() throws SQLException{
        Integer result = subtracaoService.subtracao(3, 3);
        Assertions.assertEquals(0, result);
        Mockito.verify(subtracaoRepository).save(Mockito.any(OperationModel.class));
    }

    @Tag("regression")
    @ParameterizedTest
    @CsvSource({
            "3, 3, -1",
            "3, 3, 1",
            "3, 3, 6",
            "3, 3, 9"
    })
    void shouldNotReturnInvalidSubtractOperation(int numberOne, int numberTwo, int invalidSubtractResult){
        Integer result = subtracaoService.subtracao(numberOne, numberTwo);
        Assertions.assertNotEquals(invalidSubtractResult, result);
    }



}