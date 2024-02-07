package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/LoginWithTrueCred.feature",
        glue = "stepDefs"
)
public class TrueLoginRunner extends AbstractTestNGCucumberTests {
}
