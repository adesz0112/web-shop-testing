Feature: The user can view the page in different devices
  Scenario: The user can navigate to the products page on desktop view
    Given The user is on the "https://automationexercise.com/login" page
    When The user sets the screen size to desktop
    And The user clicks on the products button
    Then The user is navigated to the products page

  Scenario: The user can navigate to the products page on tablet view
      Given The user is on the "https://automationexercise.com/login" page
      When The user sets the screen size to tablet
      And The user clicks on the products button
      Then The user is navigated to the products page


  Scenario: The user can navigate to the products page on phone view
    Given The user is on the "https://automationexercise.com/login" page
    When The user sets the screen size to phone
    And The user clicks on the products button
    Then The user is navigated to the products page