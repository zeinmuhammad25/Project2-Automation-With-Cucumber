@CreateAnAccount
Feature: Create An Account
  this feature will check the overall appearance of the scenario login and create an account

  Scenario: Invalid create an account at input email address
    Given User open the home page
    And Click button sign in
    When  User input " " as email address
    And User click button create an account
    Then User see error massage

  Scenario: Normal create an account at input email address
    Given User open the home page
    And Click button sign in
    When  User input "aalin@gmail.com" as email address
    And User click button create an account
    Then User will see the create an account input page

  Scenario: Normal create an account in page your personal information
    Given User open the home page
    And Click button sign in
    When User input "andria@gmail.com" as email address
    And User click button create an account
    When User input "azhar" as first name and "ri" as last name "12345" as password
    And User Click button register


  Scenario Outline: invalid create an account
    Given User open the home page
    And Click button sign in
    When User input "ancor@gmail.com" as email address
    And User click button create an account
    Then User see display create an account
    When User input "<firstName>" as first name and "<lastName>" as last name "<password>" as password
    And User Click button register
    Then User see "<errorMassage>" in display page
Examples:
  | firstName | lastName | password | errorMassage       |
  | azha      | asd      |          | There is 1 error   |
  |           | asd      |          | There are 2 errors |
  |           |          | 12345    | There are 2 errors |
  |           | asd      | 12345    | There is 1 error   |
  |           |          |          | There are 3 errors |
