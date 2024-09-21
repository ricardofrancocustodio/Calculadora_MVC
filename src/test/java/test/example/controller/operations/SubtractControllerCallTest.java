package test.example.controller.operations;

import org.example.controller.CalculoController;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SubtractControllerCallTest {

    @Tag("smoke")
    @Tag("Regression")
    @Test
    void shouldCallCalculoControllerAndRedirectToSubtractController(){
        CalculoController calculoController = mock(CalculoController.class);
        calculoController.calcular("subtracao",1, 1 );

        verify(calculoController).calcular("subtracao",1, 1);
    }

}
