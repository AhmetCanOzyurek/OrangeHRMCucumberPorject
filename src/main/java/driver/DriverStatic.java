package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.nio.file.WatchEvent;

import static driver.DriverFactory.*;

public class DriverStatic {
    private static WebDriver driver;

    public static WebDriver getDriver(){
        return getDriver(Browsers.CHROME);
    }

    public static WebDriver getDriver(Browsers browser){
        if(driver == null){
            switch (browser){
                case SAFARI :
                    driver = createSafari();
                    break;
                case EDGE:
                    driver = createEdge();
                    break;
                case FIREFOX:
                    driver = createFirefox();
                    break;
                default:
                    driver = createChrome();
                    break;
            }
        }
        return driver;
    }

    public static void quitDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
}
