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

    @When("the user enters {string} and chooses {string}")
    public void the_user_enters_and_chooses(String password, String gender) {
        registrationPage.enterPassword(password);
        registrationPage.chooseGender1();
    }

    @When("the user selects {string}, {string}, and {string}")
    public void the_user_selects_and(String day, String month, String year) {
       registrationPage.selectDayByValue(day);
       registrationPage.selectMonthByValue(month);
       registrationPage.selectYearByValue(year);
    }

    @When("the user enters {string}, {string}, {string}, and {string}")
    public void the_user_enters_and(String firstName, String lastName, String address1, String address2) {
        registrationPage.enterFirstName(firstName);
        registrationPage.enterLastName(lastName);
        registrationPage.enterAddress1(address1);
        registrationPage.enterAddress2(address2);
    }

    @When("the user selects  {string}, and enters {string}, {string}")
    public void the_user_selects_and_enters(String country, String state, String city) {
       registrationPage.selectCountryByValue(country);
       registrationPage.enterState(state);
       registrationPage.enterCity(city);
    }

    @When("the user enters {string} and {string} and click on submit button")
    public void the_user_enters_and_and_click_on_submit_button(String zipcode, String mobileNumber) {
        registrationPage.enterZipcode(zipcode);
        registrationPage.enterMobileNumber(mobileNumber);
    }


    @Then("user is registered")
    public void user_is_registered() {
        assertTrue(registrationPage.isAccountCreatedMessageDisplayed());
        driver.get("https://automationexercise.com/");
        homePage.clickDeleteAccount();
    }
}
