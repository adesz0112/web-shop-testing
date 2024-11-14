Feature: The user can register

  Scenario : Successful registration with valid credentials
    Given The user is on the "https://automationexercise.com/login" page
    And Enters a valid "name" and "email" and click on the register button
    When The user fills out the form with valid credetials
    And Cliks on the submit button
    Then The user is registered


