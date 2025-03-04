package StepDefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

public class ResponsiveStep {

    private WebDriver driver;
    private HomePage homePage;

    public ResponsiveStep() {
        driver = Hook.getDriver();
        this.homePage = new HomePage(driver);
    }

    @When("The user sets the screen size to desktop")
    public void the_user_sets_the_screen_size_to_desktop() {
        driver.manage().window().setSize(new Dimension(1920, 1080));
    }

    @When("The user sets the screen size to tablet")
    public void the_user_sets_the_screen_size_to_tablet() {
        driver.manage().window().setSize(new Dimension(768, 1024));
    }

    @When("The user sets the screen size to phone")
    public void the_user_sets_the_screen_size_to_phone() {
        driver.manage().window().setSize(new Dimension(375, 812)); // iphone size
    }

    @When("The user clicks on the products button")
    public void the_user_clicks_on_the_products_button() {
       homePage.clickProductsButton();
    }

}
