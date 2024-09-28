package test.runs.suites.regression;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;
import test.example.controller.CalculoControllerCallTest;
import test.example.controller.operations.DivisionControllerCallTest;
import test.example.controller.operations.MultiplyControllerCallTest;
import test.example.controller.operations.SomaControllerCallTest;
import test.example.controller.operations.SubtractControllerCallTest;
import test.example.service.DivisionServiceTest;
import test.example.service.MultiplyServiceTest;
import test.example.service.SomaServiceTest;
import test.example.service.SubtractServiceTest;

@Suite
@SelectClasses({
        SomaControllerCallTest.class,
        SubtractControllerCallTest.class,
        DivisionControllerCallTest.class,
        MultiplyControllerCallTest.class,
        CalculoControllerCallTest.class,
        SomaServiceTest.class,
        SubtractServiceTest.class,
        MultiplyServiceTest.class,
        DivisionServiceTest.class

})
@IncludeTags("regression")
@SuiteDisplayName("Regression Tests For Calculator")
public class RegressionTests {
}
