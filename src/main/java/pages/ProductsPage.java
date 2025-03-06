package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {

    JavascriptExecutor js;

    @FindBy(xpath = "//a[contains(@href, '/product_details/3')]")
    private WebElement viewProduct;
    @FindBy(xpath = "//button[contains(@class, 'btn-default cart')]")
    private WebElement addToCartButton;
    @FindBy(className = "modal-content")  // Locate the modal container
    private WebElement modal;

    public ProductsPage(WebDriver driver) {
        super(driver);
        this.js = (JavascriptExecutor) driver;
    }

    public void scrollToProduct() {
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", viewProduct);
    }

    public void viewProduct() {
        scrollToProduct();
        viewProduct.click();
    }

    public void addToCart() {
       addToCartButton.click();
    }

    public boolean isModalDisplayed() {
        return wait(modal).isDisplayed();
    }
}
