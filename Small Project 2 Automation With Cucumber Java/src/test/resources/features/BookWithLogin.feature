@BookWithLogin
Feature: Book with Login
  this feature will check the overall appearance of the scenario book with login

  Scenario: Verify button book now in page select rooms condition have not filled in the address
    Given User open the home page
    And Click button sign in
    When  User input "as@gmail.com" as email and "123456" as password
    And User click button sign in
    And User click button My Account
    When User Input "Indonesia" as location
    And  User choose hotel
    When User choose check in date and check out date
    And User click button search now
    And User click button book now
    And User click button proceed to checkout
    Then User will see display input address page

  Scenario: Normal book condition has entered the address by paying using pay bank wire
    Given User open the home page
    And Click button sign in
    When  User input "azhar@gmail.com" as email and "12345" as password
    And User click button sign in
    And User click button My Account
    When User Input "Indonesia" as location
    And  User choose hotel
    When User choose check in date and check out date
    And User click button search now
    And User click button book now
    And User click button proceed to checkout
    And User click button proceed1
    And User click button proceed2
    And User click radio button i agree to the terms of service
    And User click button pay bank wire
    And User click button i confirm my order
    Then User get a message successfully make payment
    And User click button view your order history
    Then User have been finished to order and page link to order history

  Scenario: Normal book condition has entered the address by paying using pay by check
    Given User open the home page
    And Click button sign in
    When  User input "azhar@gmail.com" as email and "12345" as password
    And User click button sign in
    And User click button My Account
    When User Input "Indonesia" as location
    And  User choose hotel
    When User choose check in date and check out date
    And User click button search now
    And User click button book now
    And User click button proceed to checkout
    And User click button proceed1
    And User click button proceed2
    And User click radio button i agree to the terms of service
    And User click button pay by check
    And User click button i confirm my order
    Then User get a message successfully make payment
    And User click button view your order history
    Then User have been finished to order and page link to order history

  Scenario: Normal book condition has entered the address by paying using pay with your paypal
    Given User open the home page
    And Click button sign in
    When  User input "azhar@gmail.com" as email and "12345" as password
    And User click button sign in
    And User click button My Account
    When User Input "Indonesia" as location
    And  User choose hotel
    When User choose check in date and check out date
    And User click button search now
    And User click button book now
    And User click button proceed to checkout
    And User click button proceed1
    And User click button proceed2
    And User click radio button i agree to the terms of service
    And User click button pay with your paypal
    And User click button i confirm my order
    Then User get a message successfully make payment
    And User click button view your order history
    Then User have been finished to order and page link to order history

  Scenario: Verify the total price of the order
    Given User open the home page
    And Click button sign in
    When  User input "azhar@gmail.com" as email and "12345" as password
    And User click button sign in
    And User click button My Account
    When User Input "Indonesia" as location
    And  User choose hotel
    When User choose check in date and check out date
    And User click button search now
    And User click button add quantity room
    And User click button book now
    And User click button proceed to checkout
    Then Users can ensure that the price is in accordance with the initial price

  Scenario: Verify chart clickable and ensure that the page will be linked to the order view
    Given User open the home page
    And Click button sign in
    When  User input "azhar@gmail.com" as email and "12345" as password
    And User click button sign in
    And User click button My Account
    When User Input "Indonesia" as location
    And  User choose hotel
    When User choose check in date and check out date
    And User click button search now
    And User click button add quantity room
    And User click button book now
    And User click button proceed to checkout
    And User click button logo cilsy
    And User click button chart




