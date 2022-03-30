@MyAccount
Feature: My Account
  this feature will check the overall appearance of the scenario in page my account

  Scenario: Make sure the page after clicking the my first address button is the display page for adding new address
    Given User open the home page
    And Click button sign in
    When  User input "azhar@gmail.com" as email and "12345" as password
    And User click button sign in
    And User click button add my first address
    Then User can make sure the next page is the data entry display

  Scenario: Normal Create Add My first Address and ensure that after the data is saved it will be linked to the my address page
    Given User open the home page
    And Click button sign in
    When  User input "azhar@gmail.com" as email and "12345" as password
    And User click button sign in
    And User click button add my first address
    When User select "Bali" as state
    When User input "cilsy" as company and "medan percut" as address and "20233" as postal code and "medan" as city and "08276542" as mobile phone
    And User click button save
    Then User can see the input that has been filled in previously that is available on the card and will be linked to the my addresses page

  Scenario Outline: Invalid create add a new address from with various filling scenarios
    Given User open the home page
    And Click button sign in
    When  User input "antrikai@gmail.com" as email and "12345" as password
    And User click button sign in
    And User click button add my first address
    When User select "Bali" as state
    When User input "<company>" as company and "<address>" as address and "<postalCode>" as postal code and "<city>" as city and "<phoneNumber>" as mobile phone
    And User click button save
    Then User will see error "<errorMassage>" with various error conditions
Examples:
  | company | address      | postalCode | city  | phoneNumber | errorMassage       |
  | cilsy   |              |            |       |             | There are 4 errors |
  | cilsy   | medan percut |            |       |             | There are 3 errors |
  | cilsy   | medan percut | 20233      |       |             | There are 2 errors |
  | cilsy   | medan percut | 20233      | medan |             | There is 1 error   |
  |         |              |            | medan | 0821312312  | There are 2 errors |
  |         | medan percut |            | medan | 0821312312  | There is 1 error   |
  | cilsy   |              | 20233      |       |             | There are 3 errors |
  |         |              |            |       | 0821312312  | There are 3 errors |


  Scenario: Make sure the page after clicking the order history and details button is the display page order history
    Given User open the home page
    And Click button sign in
    When  User input "azhar@gmail.com" as email and "12345" as password
    And User click button sign in
    And User click button order history and details
    Then User will see display page order history


  Scenario: Make sure the page after clicking the my credit slips button is the display page credit slips
    Given User open the home page
    And Click button sign in
    When  User input "azhar@gmail.com" as email and "12345" as password
    And User click button sign in
    And User click button my credit slips
    Then User will see display page credit slips

  Scenario: Make sure the page after clicking the my personal information button is the display page your personal information
    Given User open the home page
    And Click button sign in
    When  User input "azhar@gmail.com" as email and "12345" as password
    And User click button sign in
    And User click button my personal information
    Then User will see display page your personal information