package test.example.controller;


import org.example.controller.CalculoController;
import org.example.controller.OperacaoMatematica;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

/**
 * This group of tests cover the methods controlled by Controllers classes,
 * The goal is to track if each method is being called correctly when requested.
 */

public class CalculoControllerCallTest {

    @Tag("smoke")
    @Tag("regression")
    @Test
    void shouldCallCalculoController_Soma(){
        OperacaoMatematica soma =  mock(OperacaoMatematica.class);
        Map<String, OperacaoMatematica> operations =  mock(Map.class);

        when(operations.get("soma")).thenReturn(soma);

        CalculoController calculoController = new CalculoController(operations);
        calculoController.calcular("soma", 1, 1);

        verify(soma).calcular(1, 1);

    }

    @Tag("smoke")
    @Tag("regression")
    @Test
    void shouldCallCalculoController_Subtract(){
        OperacaoMatematica subtract =  mock(OperacaoMatematica.class);
        Map<String, OperacaoMatematica> operations =  mock(Map.class);

        when(operations.get("subtracao")).thenReturn(subtract);

        CalculoController calculoController = new CalculoController(operations);
        calculoController.calcular("subtracao", 1, 1);

        verify(subtract).calcular(1, 1);

    }

    @Tag("smoke")
    @Tag("regression")
    @Test
    void shouldCallCalculoController_Multiply(){
        OperacaoMatematica multiplicacao =  mock(OperacaoMatematica.class);
        Map<String, OperacaoMatematica> operations =  mock(Map.class);

        when(operations.get("multiplicacao")).thenReturn(multiplicacao);

        CalculoController calculoController = new CalculoController(operations);
        calculoController.calcular("multiplicacao", 1, 1);

        verify(multiplicacao).calcular(1, 1);

    }

    @Tag("smoke")
    @Tag("regression")
    @Test
    void shouldCallCalculoController_Division(){
        OperacaoMatematica divisao =  mock(OperacaoMatematica.class);
        Map<String, OperacaoMatematica> operations =  mock(Map.class);

        when(operations.get("divisao")).thenReturn(divisao);

        CalculoController calculoController = new CalculoController(operations);
        calculoController.calcular("divisao", 1, 1);

        verify(divisao).calcular(1, 1);

    }

    @Tag("smoke")
    @Tag("regression")
    @Test
    void shouldCallCalculoController_ExceptionForInvalidOperation() {

        Map<String, OperacaoMatematica> operations = mock(Map.class);
        CalculoController calculoController = new CalculoController(operations);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calculoController.calcular("invalid", 1, 2);
        });

        assertEquals("Operação inválida", exception.getMessage());
    }


}
