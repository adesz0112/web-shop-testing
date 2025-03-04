package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NavigationStep {

    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;

    public NavigationStep () {
        driver = Hook.getDriver();
        this.loginPage = new LoginPage(driver);
        this.homePage = new HomePage(driver);
    }

    @When("The user clicks on the products")
    public void the_user_clicks_on_the_products() {
        homePage.clickProductsButton();
    }
    @Then("The user is navigated to the products page")
    public void the_user_is_navigated_to_the_products_page() {
        String currentURL = driver.getCurrentUrl();
        assertEquals(homePage.getProductsURL(),currentURL);
    }

    @When("The user clicks on the test cases link")
    public void the_user_clicks_on_the_test_cases_link() {
        homePage.clickTestCasesButton();
    }

    @Then("The user is navigated to the test cases page")
    public void the_user_is_navigated_to_the_test_cases_page() {
       String currentURL = driver.getCurrentUrl();
       assertEquals(homePage.getTestCasesURL(),currentURL);
    }

    @When("The user clicks on the cart link")
    public void the_user_clicks_on_the_cart_link() {
       homePage.clickCartButton();
    }

    @Then("The user is navigated to the cart page")
    public void the_user_is_navigated_to_the_cart_page() {
        String currentURL = driver.getCurrentUrl();
        assertEquals(homePage.getViewCartURL(),currentURL);
    }
}
