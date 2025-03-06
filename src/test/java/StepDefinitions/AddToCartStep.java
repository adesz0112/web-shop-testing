package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductsPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddToCartStep {

    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;
    private ProductsPage productsPage;

    public AddToCartStep() {
        driver = Hook.getDriver();
        this.homePage = new HomePage(driver);
        this.loginPage = new LoginPage(driver);
        this.productsPage = new ProductsPage(driver);
    }

    @When("The user choose one product to add to the cart")
    public void the_user_choose_one_product_to_add_to_the_cart() {
       productsPage.viewProduct();
       productsPage.addToCart();
    }

    @Then("The product is in the cart")
    public void the_product_is_in_the_cart() {
       assertTrue(productsPage.isModalDisplayed());
    }
}
