package test.example.service;

import org.example.service.soma.SomaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class SomaServiceTest {

    public SomaService somaService;

    @BeforeEach
    void setup(){
        somaService = new SomaService(0, 0);
    }

    @Tag("smoke")
    @Test
    void shouldSum(){
        Integer result = somaService.soma(2, 3);
        Assertions.assertEquals(5, result);
    }

    @Tag("regression")
    @Test
    void shouldNotDivide(){
        Integer result = somaService.soma(3, 3);
        Assertions.assertNotEquals(1, result);
    }

    @Tag("regression")
    @Test
    void shouldNotMultiply(){
        Integer result = somaService.soma(2, 3);
        Assertions.assertNotEquals(6, result);

    }

    @Tag("regression")
    @Test
    void shouldNotSubtract(){
        Integer result = somaService.soma(2, 3);
        Assertions.assertNotEquals(-1, result);

    }

}