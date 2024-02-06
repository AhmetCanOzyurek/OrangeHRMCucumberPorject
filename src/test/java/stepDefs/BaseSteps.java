package stepDefs;

import _pageObjects.LoginPage.LoginPageObjects;
import _pageObjects.mainPage.MainPageObjects;
import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseSteps {
    LoginPageObjects loginObjects;
    MainPageObjects mainObjects;

    protected WebDriver driver;
    protected WebDriverWait wait;

    protected BaseSteps() {
        driver = Driver.getDriver();
        wait = Driver.getWait();
        loginObjects = new LoginPageObjects();
        mainObjects = new MainPageObjects();
    }

    public void click(By locator) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        click(element);
    }

    public void click(WebElement element) {
        wait.until(driver1 -> {
            try {
                element.click();
                return true;
            } catch (Exception e1) {
                try {
                    new Actions(driver1).moveToElement(element).click().perform();
                    ;
                    return true;
                } catch (Exception e2) {
                    try {
                        ((JavascriptExecutor) driver1).executeScript("arguments[0].click", element);
                        return true;
                    } catch (Exception e3) {
                        return false;
                    }
                }
            }
        });
    }

    public void sendKeys(By locator, String text){
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        sendKeys(element,text);
    }

    public void sendKeys(WebElement element, String text) {
        wait.until(driver1 -> {
            try {
                element.sendKeys(text);
                return true;
            } catch (Exception e1) {
                try {
                    new Actions(driver1).sendKeys(text).perform();
                    return true;
                } catch (Exception e2) {
                    try {
                        ((JavascriptExecutor) driver1).executeScript("arguments[0].value'" + text + "'", element);
                        return true;
                    } catch (Exception e4) {
                        return false;
                    }
                }
            }
        });
    }

    public void waitForVisibility(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitForVisibility(By locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

}
