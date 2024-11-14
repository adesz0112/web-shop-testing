package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

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
 private WebElement dayDropdown;
 @FindBy (id = "months")
 private WebElement monthDropDown;
 @FindBy (id = "years")
 private WebElement yearDropDown;
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
 private WebElement countryDropDown;
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

 public void chooseGender1 () {
  genderButton1.click();
 }
 public void chooseGender2 () {
  genderButton2.click();
 }
 public void enterPassword (String password) {
  wait(passwordInput).sendKeys(password);
 }
 public void selectDayByValue(String value) {
  Select select = new Select(dayDropdown);
  select.selectByValue(value);
 }

 public void selectMonthByValue(String value) {
  Select select = new Select(monthDropDown);
  select.selectByValue(value);
 }

 public void selectYearByValue(String value) {
  Select select = new Select(yearDropDown);
  select.selectByValue(value);
 }


 public void enterFirstName (String firstName) {
  wait(firstNameInput).sendKeys(firstName);
 }

 public void enterLastName (String lastName) {
  wait(lastNameInput).sendKeys(lastName);
 }

 public void enterCompany (String company) {
  wait(companyInput).sendKeys(company);
 }

 public void enterAddress1 (String address1) {
  wait(address1Input).sendKeys(address1);
 }

 public void enterAddress2 (String address2) {
  wait(address2Input).sendKeys(address2);
 }

 public void selectCountryByValue(String value) {
  Select select = new Select(countryDropDown);
  select.selectByValue(value);
 }

 public void enterState (String state) {
  wait(stateInput).sendKeys(state);
 }

 public void enterCity (String city) {
  wait(cityInput).sendKeys(city);
 }

 public void enterZipcode (String zipcode) {
  wait(zipcodeInput).sendKeys(zipcode);
 }

 public void enterMobileNumber (String mobileNumber) {
  wait(mobileNumberInput).sendKeys(mobileNumber);
 }

 public void clickCreateAccountButton () {
  createAccountButton.click();
 }

 public void clickContinueButton () {
  continueButton.click();
 }

 public void clickSignUpButton () {
  signUpButton.click();
 }
}
