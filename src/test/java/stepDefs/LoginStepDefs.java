package stepDefs;

import _pageObjects.LoginPage.LoginPageObjects;
import _pageObjects.mainPage.MainPageObjects;
import driver.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.devtools.v117.audits.model.StyleSheetLoadingIssueReason;

import java.util.List;
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

        String username = (map.get("username") == null) ? "null" : map.get("username");
        String password = (map.get("password") == null) ? "null" : map.get("password");

        sendKeys(loginObjects.lUserNameBox,username);
        sendKeys(loginObjects.lPasswordBox,password);
    }

    @And("user clicks login button")
    public void userClicksLoginButton() {
        click(loginObjects.lSubmitButton);
    }

    @Then("login should be succesfull")
    public void loginShouldBeSuccesfull() {
        waitForVisibility(mainObjects.userDropDown);
    }


    @Then("login should be failed and invalid  credentials text should be visible")
    public void loginShouldBeFailedAndInvalidCredentialsTextShouldBeVisible() {
        waitForVisibility(loginObjects.lInvalidCredentialsTxt);
    }


    @Then("login should be {string}")
    public void loginShouldBeAs(String str) {
        if(str.equalsIgnoreCase("true")){
            waitForVisibility(mainObjects.userDropDown);
            click(mainObjects.userDropDown);
            click(mainObjects.userDropDownLogout);
        }else{
            waitForVisibility(loginObjects.lInvalidCredentialsTxt);
        }
    }

    @When("user clicks social media button as follows")
    public void userClicksSocialMediaButtonAsFollows(DataTable table) {
    }

    @And("social media page should be visible")
    public void socialMediaPageShouldBeVisible() {
    }

    @Then("user come back login page")
    public void userComeBackLoginPage() {
    }
}
