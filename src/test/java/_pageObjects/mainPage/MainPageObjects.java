package _pageObjects.mainPage;

import driver.Driver;
import io.cucumber.java.it.Ma;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageObjects {
    public MainPageObjects() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(css=".oxd-userdropdown-tab")
    public WebElement userDropDown;
    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement userDropDownLogout;
}
