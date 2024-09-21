package test.example.service;

import org.example.service.divisao.DivisaoService;
import org.example.service.soma.SomaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class DivisionServiceTest {

    public DivisaoService divisaoService;

    @BeforeEach
    void setup(){
        divisaoService = new DivisaoService(0, 0);
    }

    @Tag("smoke")
    @Test
    void shouldDivide(){
        Integer result = divisaoService.divisao(3, 3);
        Assertions.assertEquals(1, result);
    }

    @Tag("regression")
    @Test
    void shouldNotSum(){
        Integer result = divisaoService.divisao(3,3);
        Assertions.assertNotEquals(6, result);
    }

    @Tag("regression")
    @Test
    void shouldNotMultiply(){
        Integer result = divisaoService.divisao(3, 3);
        Assertions.assertNotEquals(9, result);

    }

    @Tag("regression")
    @Test
    void shouldNotSubtract(){
        Integer result = divisaoService.divisao(3, 3);
        Assertions.assertNotEquals(0, result);

    }

}