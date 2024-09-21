package test.example.service;

import org.example.service.divisao.DivisaoService;
import org.example.service.multiplicacao.MultiplicacaoService;
import org.example.service.soma.SomaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class MultiplyServiceTest {

    public MultiplicacaoService multiplicacaoService;

    @BeforeEach
    void setup(){
        multiplicacaoService = new MultiplicacaoService(0, 0);
    }

    @Tag("smoke")
    @Test
    void shouldMultiply(){
        Integer result = multiplicacaoService.multiplicacao(3, 3);
        Assertions.assertEquals(9, result);
    }

    @Tag("regression")
    @Test
    void shouldNotDivide(){
        Integer result = multiplicacaoService.multiplicacao(3, 3);
        Assertions.assertNotEquals(1, result);
    }

    @Tag("regression")
    @Test
    void shouldNotSum(){
        Integer result = multiplicacaoService.multiplicacao(3, 3);
        Assertions.assertNotEquals(6, result);

    }

    @Tag("regression")
    @Test
    void shouldNotSubtract(){
        Integer result = multiplicacaoService.multiplicacao(3, 3);
        Assertions.assertNotEquals(0, result);

    }

}