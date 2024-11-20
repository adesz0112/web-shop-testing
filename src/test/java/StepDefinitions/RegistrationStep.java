package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.RegistrationPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegistrationStep  {

    private WebDriver driver;
    private RegistrationPage registrationPage;
    private HomePage homePage;

    public RegistrationStep() {
        this.driver = Hook.getDriver();
        this.registrationPage = new RegistrationPage(driver);
        this.homePage = new HomePage(driver);
    }

    @Given("the user on the {string} page")
    public void the_user_on_the_page(String url) {
        driver.get(url);
        registrationPage.acceptConsent();
    }
    @Given("the user enter valid {string} username and valid {string} email")
    public void the_user_enter_valid_username_and_valid_email(String username, String email) {
        registrationPage.enterName(username);
        registrationPage.enterEmail(email);
        registrationPage.clickSignUpButton();
    }
    @When("user submits the form with the valid credentials")
    public void user_submits_the_form_with_the_valid_credentials() {
        registrationPage.enterPassword("test");
        registrationPage.chooseGender1();
        registrationPage.selectDayByValue("5");
        registrationPage.selectMonthByValue("10");
        registrationPage.selectYearByValue("1990");
        registrationPage.enterFirstName("First Name");
        registrationPage.enterLastName("Last Name");
        registrationPage.enterCompany("test");
        registrationPage.enterAddress1("Test Address");
        registrationPage.enterAddress2("Test Address");
        registrationPage.selectCountryByValue("Canada");
        registrationPage.enterState("New York");
        registrationPage.enterCity("New York");
        registrationPage.enterZipcode("5000");
        registrationPage.enterMobileNumber("0053555");
        registrationPage.clickCreateAccountButton();
    }
    @Then("user can register")
    public void user_can_register() {
        assertTrue(registrationPage.isAccountCreatedMessageDisplayed());
        driver.get("https://automationexercise.com/");
        homePage.clickDeleteAccount();
    }
}
