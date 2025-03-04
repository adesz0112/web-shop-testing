package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[@href='/delete_account' and contains(@style, 'color:brown')]")
    private WebElement deleteAccount;
    @FindBy(xpath = "//a[@href='/logout' and contains(@style, 'color:brown')]")
    private WebElement logout;
    @FindBy(xpath = "//p[contains(text(), 'Your email or password is incorrect!')]")
    private WebElement errorMessage;
    @FindBy(xpath = "//a[contains(@href, '/products')]")
    private WebElement products;
    @FindBy(xpath = "//a[contains(@href, '/test_cases')]")
    private WebElement testCasePageButton;
    @FindBy(xpath = "//a[contains(@href, '/view_cart')]")
    private WebElement cartPageLink;
    private final String productsURL = "https://automationexercise.com/products";
    private final String testCasesURL = "https://automationexercise.com/test_cases";
    private final String viewCartURL = "https://automationexercise.com/view_cart";


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickDeleteAccount() {
        deleteAccount.click();
    }

    public void clickLogoutButton() {
        logout.click();
    }

    public void clickProductsButton() {
        products.click();
    }

    public void clickTestCasesButton() {
        testCasePageButton.click();
    }

    public void clickCartButton() {
        cartPageLink.click();
    }

    public boolean logoutButtonIsVisible() {
        return logout.isDisplayed();
    }

    public boolean isErrorMessageDisplayed() {
        try {
            return errorMessage.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public String getProductsURL() {
        return productsURL;
    }

    public String getTestCasesURL() {
        return testCasesURL;
    }

    public String getViewCartURL() {
        return viewCartURL;
    }
}
