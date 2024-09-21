package test.example.service;

import org.example.service.divisao.DivisaoService;
import org.example.service.soma.SomaService;
import org.example.service.subtracao.SubtracaoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SubtractServiceTest {

    public SubtracaoService subtracaoService;

    @BeforeEach
    void setup(){
        subtracaoService = new SubtracaoService(0, 0);
    }
    @Tag("smoke")
    @Test
    void shouldSubtract(){
        Integer result = subtracaoService.subtracao(3, 3);
        Assertions.assertEquals(0, result);
    }

    @Tag("regression")
    @Test
    void shouldNotDivide(){
        Integer result = subtracaoService.subtracao(3, 3);
        Assertions.assertNotEquals(1, result);
    }

    @Tag("regression")
    @Test
    void shouldNotMultiply(){
        Integer result = subtracaoService.subtracao(3, 3);
        Assertions.assertNotEquals(9, result);

    }

    @Tag("regression")
    @Test
    void shouldNotSum(){
        Integer result = subtracaoService.subtracao(3, 3);
        Assertions.assertNotEquals(6, result);

    }

}