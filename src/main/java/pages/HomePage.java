package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[@href='/delete_account' and contains(@style, 'color:brown')]")
    private WebElement deleteAccount;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickDeleteAccount() {
        deleteAccount.click();
    }
}
