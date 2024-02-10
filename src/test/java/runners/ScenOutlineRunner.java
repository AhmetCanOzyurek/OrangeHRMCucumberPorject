package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/LoginWithSceOutline.feature",
        glue = "stepDefs"
)
public class ScenOutlineRunner extends AbstractTestNGCucumberTests {
}
