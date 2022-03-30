@Login
Feature: Login
  this feature will check the overall appearance of the scenario login and create an account

  Scenario: Normal login
    Given User open the home page
    And Click button sign in
    When  User input "amokei@gmail.com" as email and "12345" as password
    And User click button sign in
    Then User will direct to my account page

  Scenario Outline: Invalid login
    Given User open the home page
    And Click button sign in
    When  User input "<userName>" as email and "<password>" as password
    And User click button sign in
    Then User will see error "<errorMassage>" on login page
Examples:
  | userName        | password | errorMassage               |
  | azhar@gmail.com |          | Password is required.      |
  |                 | 12345    | An email address required. |
  |                 |          | An email address required. |




