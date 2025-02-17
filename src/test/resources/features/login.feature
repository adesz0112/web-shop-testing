Feature: User can login
  Scenario: User can login with already registered credentials
    Given The user is on the "https://automationexercise.com/login" page
    And The user enters the already registered email "test@ter5rt.com" and password "test"
    When The user clicks on the login button
    Then The user is logged in and can log out

  Scenario: User can't login with not registered credentials
    Given The user is on the "https://automationexercise.com/login" page
    And The user enters not registered credentials email "test@test.com" and password "test5"
    When The user clicks on the login button
    Then The user cannot log in to the page