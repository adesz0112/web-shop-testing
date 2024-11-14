package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
 @FindBy (css = "input[data-qa='signup-name']")
 private WebElement nameInput;
 @FindBy (css ="input[data-qa='signup-email']")
 private WebElement emailInput;
 @FindBy (css = "button[data-qa='signup-button']")
 private WebElement signUpButton;
 @FindBy (id = "id_gender1")
 private WebElement genderButton1;
 @FindBy (id = "id_gender2")
 private WebElement genderButton2;
 @FindBy (id = "password")
 private WebElement passwordInput;
 @FindBy (id = "days")
 private WebElement daysInput;
 @FindBy (id = "months")
 private WebElement monthInput;
 @FindBy (id = "years")
 private WebElement yearInput;
 @FindBy (id = "first_name")
 private WebElement firstNameInput;
 @FindBy (id = "last_name")
 private WebElement lastNameInput;
 @FindBy (id = "company")
 private WebElement companyInput;
 @FindBy (id = "address1")
 private WebElement address1Input;
 @FindBy (id = "address2")
 private WebElement address2Input;
 @FindBy (id = "country")
 private WebElement countrySelector;
 @FindBy (id = "state")
 private WebElement stateInput;
 @FindBy (id = "city")
 private WebElement cityInput;
 @FindBy (id = "zipcode")
 private WebElement zipcodeInput;
 @FindBy (id = "mobile_number")
 private WebElement mobileNumberInput;
 @FindBy(css = "button[data-qa='create-account']")
 private WebElement createAccountButton;
 @FindBy(css = "button[data-qa='continue-button']")
 private WebElement continueButton;





 public RegistrationPage (WebDriver driver) {
  super(driver);
 }

 public void enterName (String name) {
  wait(nameInput).sendKeys(name);
 }
 public void enterEmail (String email) {
  wait(emailInput).sendKeys(email);
 }
}
