package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/socialMedia.feature",
        glue = "stepDefs"
)
public class SocialMediaRunner extends AbstractTestNGCucumberTests {
}
