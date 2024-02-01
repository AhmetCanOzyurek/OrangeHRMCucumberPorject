package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static driver.DriverFactory.*;

public class Driver {
    private static ThreadLocal<WebDriver> drivers= new ThreadLocal<>();
    private static ThreadLocal<WebDriverWait> waits = new ThreadLocal<>();
    private static ThreadLocal<Browsers> browsers = new ThreadLocal<>();
 public static WebDriver getDriver(){
     if(browsers.get() == null)
     browsers.set(Browsers.CHROME);

     return getDriver(browsers.get());
 }

    public static WebDriver getDriver (Browsers browser){
        browsers.set(browser);
        if(drivers.get() == null){
            switch (browser) {
                case SAFARI :
                    drivers.set(createSafari());
                    break;
                case FIREFOX:
                    drivers.set(createFirefox());
                    break;
                case EDGE:
                    drivers.set(createEdge());
                    break;
                default:
                    drivers.set(createChrome());
                    break;
            }
        }
        waits.set(new WebDriverWait(drivers.get(), Duration.ofSeconds(10)));
        return drivers.get();
    }
    public static WebDriverWait getWait(){
        return waits.get();
    }

    public static void quitDriver(){
        if(drivers.get() != null){
            drivers.get().quit();
            drivers.set(null);
        }
    }
}
