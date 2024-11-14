package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    private final int WAIT_SECOND = 5;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_SECOND));
        PageFactory.initElements(driver, this);
    }

    protected WebElement wait(WebElement webElement) {
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        wait.until(ExpectedConditions.visibilityOf(webElement));
        return webElement;
    }
}
