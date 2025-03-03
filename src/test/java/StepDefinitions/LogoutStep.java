package StepDefinitions;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogoutStep {

    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;

    public LogoutStep(){
        driver = Hook.getDriver();
        this.homePage = new HomePage(driver);
        this.loginPage = new LoginPage(driver);
    }

    @Given("The user is logged in to the site {string}")
    public void the_user_is_logged_in_to_the_site(String url) {
       driver.get(url);
       loginPage.acceptConsent();
    }

    @Given("with valid email {string} and password {string}")
    public void with_valid_email_and_password(String email, String password) {
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
    }


    @When("The user clicks on the logout button")
    public void the_user_clicks_on_the_logout_button() {
        homePage.clickLogoutButton();
    }
    @Then("The user is navigated to the login page")
    public void the_user_is_navigated_to_the_login_page() {
       String currentURL = driver.getCurrentUrl();
        assertEquals(loginPage.getLoginPageURL(),currentURL);
    }
}
