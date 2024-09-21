package test.example.controller.operations;

import org.example.controller.CalculoController;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MultiplyControllerCallTest {

    @Tag("regression")
    @Test
    void shouldCallCalculoControllerAndRedirectToMultiplyController(){
        CalculoController calculoController = mock(CalculoController.class);
        calculoController.calcular("multiplicacao",1, 1 );

        verify(calculoController).calcular("multiplicacao",1, 1);
    }

}
