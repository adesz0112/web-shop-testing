package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{

    @FindBy(css = "button[data-qa='login-button']")
    private WebElement loginButton;
    @FindBy(css ="input[data-qa='login-email']")
    private WebElement loginEmail;
    @FindBy(css = "input[data-qa='login-password']")
    private WebElement loginPassword;
    @FindBy(xpath = "//p[contains(@class, 'fc-button-label') and text()='Beleegyezés']")
    private WebElement consentButton;
    private final String loginPageURL = "https://automationexercise.com/login";


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmail(String email) {
        loginEmail.sendKeys(email);
    }

    public void enterPassword(String password) {
        loginPassword.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void acceptConsent() {
        wait.until(ExpectedConditions.elementToBeClickable(consentButton)).click();
    }

    public String getLoginPageURL() {
        return loginPageURL;
    }
}
