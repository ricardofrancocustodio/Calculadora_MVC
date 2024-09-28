package test.example.service;

import org.example.model.operations.OperationModel;
import org.example.repository.soma.SomaRepository;
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


public class SomaServiceTest {

    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/calculadora_mvc", "root", "");
    public SomaService somaService;
    public SomaRepository somaRepository = new SomaRepository(connection);

    public SomaServiceTest() throws SQLException {
    }

    @BeforeEach
    void setup(){
        somaRepository = Mockito.mock(somaRepository.getClass());
        somaService =  new SomaService(somaRepository);
    }

    @Tag("smoke")
    @Test
    void shouldSum() throws SQLException {
        Integer result = somaService.soma(3, 3);
        Assertions.assertEquals(6, result);
        Mockito.verify(somaRepository).save(Mockito.any(OperationModel.class));
    }

    @Tag("regression")
    @ParameterizedTest
    @CsvSource({
            "3, 3, -1",
            "3, 3, 1",
            "3, 3, 0",
            "3, 3, 9"
    })
    void shouldNotReturnInvalidSumOperation(int numberOne, int numberTwo, int invalidSumResult){
        Integer result = somaService.soma(numberOne, numberTwo);
        Assertions.assertNotEquals(invalidSumResult, result);
    }


}