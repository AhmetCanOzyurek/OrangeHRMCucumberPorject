package _pageObjects.LoginPage;

import driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class LoginPageObjects {
public LoginPageObjects(){
    PageFactory.initElements(Driver.getDriver(),this);
}

    @FindBy(xpath = "(//*[@role='presentation'])[1]")
    public WebElement lLinkedinButton;
    @FindBy(xpath = "(//*[@role='presentation'])[2]")
    public WebElement lFaceBookButton;
    @FindBy(xpath = "(//*[@role='presentation'])[3]")
    public WebElement lTwitterButton;
    @FindBy(xpath = "(//*[@role='presentation'])[4]")
    public WebElement lYoutubeButton;
    @FindBy(xpath = "//*[text()='Forgot your password? ']")
    public WebElement lForgotYourPassword;
    @FindBy(xpath = "//img[@alt='company-branding']")
    public WebElement lOrangeHRMLogo;
    @FindBy(xpath = "//*[text()='Login']")
    public WebElement lLoginText;
    @FindBy(xpath = "//input[@name='username']")
    public WebElement lUserNameBox;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement lPasswordBox;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement lSubmitButton;
}
