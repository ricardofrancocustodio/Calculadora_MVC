package test.example.controller.operations;

import org.example.controller.CalculoController;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class DivisionControllerCallTest {


    @Tag("regression")
    @Test
    void shouldCallCalculoControllerAndRedirectToDivisionController(){
        CalculoController calculoController = mock(CalculoController.class);
        calculoController.calcular("divisao",1, 1 );

        verify(calculoController).calcular("divisao",1, 1);
    }
}
