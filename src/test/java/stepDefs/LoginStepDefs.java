package stepDefs;

import _pageObjects.LoginPage.LoginPageObjects;
import _pageObjects.mainPage.MainPageObjects;
import driver.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class LoginStepDefs extends BaseSteps{


    @Given("user on homepage")
    public void userOnHomepage() {
        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver.get(url);
    }

    @And("login page should be visible")
    public void loginPageShouldBeVisible() {
        waitForVisibility(loginObjects.lOrangeHRMLogo);
    }

    @When("user enter username and password as follows")
    public void userEnterUsernameAndPasswordAsFollows(DataTable table) {
        Map<String,String> map = table.asMap();

        sendKeys(loginObjects.lUserNameBox,map.get("username"));
        sendKeys(loginObjects.lPasswordBox,map.get("password"));
    }

    @And("user clicks login button")
    public void userClicksLoginButton() {
        click(loginObjects.lSubmitButton);
    }

    @Then("login should be succesfull")
    public void loginShouldBeSuccesfull() {
        waitForVisibility(mainObjects.userDropDown);
    }

    @Then("quit from driver")
    public void quitFromDriver() {
        Driver.quitDriver();
    }

    @Then("login should be failed and invalid  credentials text should be visible")
    public void loginShouldBeFailedAndInvalidCredentialsTextShouldBeVisible() {
        waitForVisibility(loginObjects.lInvalidCredentialsTxt);
    }
}
