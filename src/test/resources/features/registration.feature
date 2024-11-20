Feature: Sample Test
  Scenario: Simple scenario
    Given the user on the "https://automationexercise.com/login" page
    And the user enter valid "test" username and valid "test@ter4rt.com" email
    When user submits the form with the valid credentials
    Then user can register


