package stepDefs;

import driver.Driver;
import io.cucumber.java.After;

public class Hooks {
    @After
    public void after(){
        Driver.quitDriver();
    }
}
