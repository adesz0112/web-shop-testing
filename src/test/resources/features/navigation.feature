Feature: The user can navigate on the page
  Scenario: The user can navigate to the products page
    Given The user is logged in to the site "https://automationexercise.com/login"
    And with valid email "test@ter5rt.com" and password "test"
    When The user clicks on the products
    Then The user is navigated to the products page


    Scenario: The user car navigate to the Test_Cases page
      Given The user is logged in to the site "https://automationexercise.com/login"
      And with valid email "test@ter5rt.com" and password "test"
      When The user clicks on the test cases link
      Then The user is navigated to the test cases page


      Scenario: The user can navigate to the cart page
        Given The user is logged in to the site "https://automationexercise.com/login"
        And with valid email "test@ter5rt.com" and password "test"
        When The user clicks on the cart link
        Then The user is navigated to the cart page
