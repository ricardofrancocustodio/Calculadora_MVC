package test.runs.suites.smoke;


import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;


import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;
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
        SomaServiceTest.class,
        SubtractServiceTest.class,
        MultiplyServiceTest.class,
        DivisionServiceTest.class

})
@IncludeTags("smoke")
@SuiteDisplayName("Smoke Tests For Calculator")
public class SmokeTests {
}
