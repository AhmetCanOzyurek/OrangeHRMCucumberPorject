package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/LoginWithFalseCred.feature",
        glue = "stepDefs"
)
public class FalseLoginRunner  extends AbstractTestNGCucumberTests {
}
