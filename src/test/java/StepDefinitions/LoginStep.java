package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginStep {

    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;

    public LoginStep() {
        this.driver = Hook.getDriver();
        this.loginPage = new LoginPage(driver);
        this.homePage = new HomePage(driver);
    }
    @Given("The user is on the {string} page")
    public void the_user_is_on_the_page(String url) {
        driver.get(url);
        loginPage.acceptConsent();
    }
    @Given("The user enters the already registered email {string} and password {string}")
    public void the_user_enters_the_already_registered_email_and_password(String email, String password) {
       loginPage.enterEmail(email);
       loginPage.enterPassword(password);
    }

    @Given("The user enters not registered credentials email {string} and password {string}")
    public void the_user_enters_not_registered_credentials_email_and_password(String email, String password) {
       loginPage.enterEmail(email);
       loginPage.enterPassword(password);
    }

    @When("The user clicks on the login button")
    public void the_user_clicks_on_the_login_button() {
       loginPage.clickLoginButton();
    }
    @Then("The user is logged in and can log out")
    public void the_user_is_logged_in_and_can_log_out() {
        assertTrue(homePage.logoutButtonIsVisible());
        homePage.clickLogoutButton();
    }

    @Then("The user cannot log in to the page")
    public void the_user_cannot_log_in_to_the_page() {
        assertTrue(homePage.isErrorMessageDisplayed());
    }
}
