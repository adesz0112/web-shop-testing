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

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickDeleteAccount() {
        deleteAccount.click();
    }

    public void clickLogoutButton() {
        logout.click();
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
}
