package TestNG;

import org.testng.annotations.Test;
import stepDefs.BaseSteps;

public class dnemee extends BaseSteps {
    @Test
    public void deneme(){
        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver.get(url);
    }
}
