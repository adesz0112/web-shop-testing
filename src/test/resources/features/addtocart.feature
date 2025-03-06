Feature: The user can add products to the cart
  Scenario: The user can add one product to the cart
    Given The user is logged in to the site "https://automationexercise.com/login"
    And with valid email "test@ter5rt.com" and password "test"
    And The user clicks on the products
    When The user choose one product to add to the cart
    Then The product is in the cart