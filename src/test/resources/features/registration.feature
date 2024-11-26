Feature: Sample Test
  Scenario: Simple scenario
    Given the user on the "https://automationexercise.com/login" page
    And the user enter valid "test" username and valid "test@ter5rt.com" email
    When user submits the form with the valid credentials
    Then user is registered


    Scenario Outline:  Successful registration with special characters
      Given the user on the "https://automationexercise.com/login" page
      And the user enter valid "<userName>" username and valid "<email>" email
      When the user enters "<password>" and chooses "<gender>"
      And the user selects "<day>", "<month>", and "<year>"
      And the user enters "<FirstName>", "<LastName>", "<address1>", and "<address2>"
      And the user selects  "<country>", and enters "<state>", "<city>"
      And the user enters "<zipcode>" and "<mobileNumber>" and click on submit button
      Then user is registered

      Examples:
        | userName       | email                         | password   | gender  | day | month | year | FirstName   | LastName   | address1          | address2 | country  | state      | city       | zipcode | mobileNumber |
        | john_doe       | john.doe@example.com          | test123!   | Male    | 5   | 10    | 1990 | John        | Doe        | 123 Main St!      | Apt. 4   | Canada   | New York   | Toronto    | 12345   | +1-555-5555  |
        | jane.doe       | jane-doe123@example.co.uk     | $pecial123 | Female  | 15  | 8     | 1985 | Jane        | D'oe       | "Addr#1"          | Addr@2   | USA      | California | San Diego  | 54321   | 123-456-7890 |
        | user_name123   | username.123@example.org      | my_pass    | Male    | 25  | 12    | 2000 | User<Name>  | Last*Name  | Address!          |          | UK       | London     | Cambridge  | A1B2C3  | 0044-1234567 |
        | special_user   | special+user@example.com      | tE$t987    | Female  | 10  | 3     | 1975 | Test'User   | Example@   | Test&Address      | Apt 2B   | Germany  | Bavaria    | Munich     | 98765   | 089-12345678 |
        | validUser      | valid.user@example.net        | validPass  | Male    | 1   | 1     | 1995 | John123     | Doe@Name   | Valid Street      | Floor 3  | France   | Paris      | Nice       | 11111   | +33-12345678 |
        | test_user123!  | test_user!@example.io         | Pass!word1 | Female  | 20  | 6     | 1992 | Alice       | Wonderland | Wonderland Ave.   | Unit B   | Australia| Victoria   | Melbourne  | 3000    | +61-400-1234 |
        | user-with-dash | user-with-dash@example.biz    | Passw0rd$  | Male    | 12  | 11    | 1998 | Dash        | User       | Dash Address      | Suite 7  | Spain    | Madrid     | Barcelona  | 56789   | +34-12345678 |