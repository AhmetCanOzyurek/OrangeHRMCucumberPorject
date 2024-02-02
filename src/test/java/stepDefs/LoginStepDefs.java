package stepDefs;

import _pageObjects.LoginPage.LoginPageObjects;
import _pageObjects.mainPage.MainPageObjects;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class LoginStepDefs extends BaseSteps{
    LoginPageObjects loginObjects;
    MainPageObjects mainObjects;


    @Given("User on homepage")
    public void userOnHomepage() {
        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver.get(url);
    }

    @And("Login page should be visible")
    public void loginPageShouldBeVisible() {
        waitForVisibility(loginObjects.lOrangeHRMLogo);
    }

    @When("User enter username and password as follows")
    public void userEnterUsernameAndPasswordAsFollows(DataTable table) {
        Map<String,String> map = table.asMap();

        sendKeys(loginObjects.lUserNameBox,map.get("username"));
        sendKeys(loginObjects.lPasswordBox,map.get("password"));
    }

    @And("user clicks login button")
    public void userClicksLoginButton() {
        click(loginObjects.lSubmitButton);
    }

    @Then("Login should be succesfull")
    public void loginShouldBeSuccesfull() {
        waitForVisibility(mainObjects.userDropDown);
    }
}
