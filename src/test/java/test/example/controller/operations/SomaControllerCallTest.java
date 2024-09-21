package test.example.controller.operations;

import org.example.controller.CalculoController;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SomaControllerCallTest {

    @Tag("smoke")
    @Tag("Regression")
    @Test
    void shouldCallCalculoControllerAndRedirectToSomaController(){
        CalculoController calculoController = mock(CalculoController.class);
        calculoController.calcular("soma",1, 1 );

        verify(calculoController).calcular("soma",1, 1);
    }

}
