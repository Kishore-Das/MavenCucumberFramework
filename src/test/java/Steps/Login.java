package Steps;

import Base.BaseTest;
import PageObjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login {
   // WebDriver driver;
    LoginPage loginPage= new LoginPage (BaseTest.getDriver());


    @Given("^Landed on Homepage$")
    public void landed_on_homepage() {
        System.out.println("homepage");
    }

    @Then("^Login as a user$")
    public void login_as_a_user() {
        loginPage.clickOnSignInButton();
        loginPage.enterUserID();
        loginPage.enterPassword();
        loginPage.clickOnSignInButton();

    }

}
