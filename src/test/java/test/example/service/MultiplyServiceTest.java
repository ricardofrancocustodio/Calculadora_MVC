package test.example.service;

import org.example.model.operations.OperationModel;
import org.example.repository.multiplicacao.MultiplicacaoRepository;
import org.example.service.multiplicacao.MultiplicacaoService;
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

public class MultiplyServiceTest {

    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/calculadora_mvc", "root", "");
    public MultiplicacaoService multiplicacaoService;

    public MultiplicacaoRepository multiplicacaoRepository = new MultiplicacaoRepository(connection);

    public MultiplyServiceTest() throws SQLException {
    }

    @BeforeEach
    void setup(){
        multiplicacaoRepository = Mockito.mock(multiplicacaoRepository.getClass());
        multiplicacaoService =  new MultiplicacaoService(multiplicacaoRepository);
    }

    @Tag("smoke")
    @Test
    void shouldMultiply() throws SQLException {
        Integer result = multiplicacaoService.multiplicacao(3, 3);
        Assertions.assertEquals(9, result);
        Mockito.verify(multiplicacaoRepository).save(Mockito.any(OperationModel.class));
    }

    @Tag("regression")
    @ParameterizedTest
    @CsvSource ({
     "3, 3, 0",
     "3, 3, -1",
     "3, 3, 1",
     "3, 3, 6"
    })
    void shouldNotReturnInvalidMultiplyOperation(int numberOne, int numberTwo, int invalidMultiplyResult) {
        Integer result = multiplicacaoService.multiplicacao(numberOne, numberTwo);
        Assertions.assertNotEquals(invalidMultiplyResult, result);
    }

}