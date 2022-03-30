@BookWithoutLogin
Feature: Book Without Login
  this feature will check the overall appearance of the scenario book without login

  Scenario: Ensure when users can book from feature book now from our rooms display on the home page
    Given User open the home page
    And User click button now at executive rooms
    Then User will to direct to link new tab

  Scenario: The facilities displayed on the amenities home page do not match the facilities available in the room information
    Given User open the home page
    Then User sees the view of the facilities offered at amenities
    When User Input "Indonesia" as location
    And  User choose hotel
    When User choose check in date and check out date
    And User click button search now
    And  User click view more at description room
    Then The user will see the available display on the personal room view that does not match

  Scenario: Verify button refund policies and reviews
    Given User open the home page
    Then User sees the view of the facilities offered at amenities
    When User Input "Indonesia" as location
    And  User choose hotel
    When User choose check in date and check out date
    And User click button search now
    And User click view more at description room
    And User click button Refund policies
    And User click button reviews can work

  Scenario: verify the modify search button and make sure it will be linked to the room selection page
    Given User open the home page
    Then User sees the view of the facilities offered at amenities
    When User Input "Indonesia" as location
    And  User choose hotel
    When User choose check in date and check out date
    And User click button search now
    And User click view more at description room
    And User click button modify search
    And User click button search rooms
    Then User be linked to the room selection page

  Scenario: Verify slider worth
    Given User open the home page
    When User Input "Indonesia" as location
    And  User choose hotel
    When User choose check in date and check out date
    And User click button search now
    When User slide the slider for setting display value price
    Then Displaying will sort the display according to the slide made by the user

  Scenario: Normal scenario booking a room until the payment process with pay by bank wire
    Given User open the home page
    When User Input "Indonesia" as location
    And  User choose hotel
    When User choose check in date and check out date
    And User click button search now
    And User click button book now
    And User click button proceed to checkout
    And User click button proceed1
    When User Input "aldi" as firstName and "ri" as lastName and "as61235@gmail.com" as email and "12345" as password and "09123112" as numberPhone and save
    And User click button proceed2
    And User click radio button i agree to the terms of service
    And User click button pay bank wire
    And User click button i confirm my order
    Then User get a message successfully make payment
    And User click button view your order history
    Then User have been finished to order and page link to order history

  Scenario: Normal scenario booking a room until the payment process with pay by check
    Given User open the home page
    When User Input "Indonesia" as location
    And  User choose hotel
    When User choose check in date and check out date
    And User click button search now
    And User click button book now
    And User click button proceed to checkout
    And User click button proceed1
    When User Input "aldi" as firstName and "ri" as lastName and "abrcata123@gmail.com" as email and "12345" as password and "09123112" as numberPhone and save
    And User click button proceed2
    And User click radio button i agree to the terms of service
    And User click button pay by check
    And User click button i confirm my order
    Then User get a message successfully make payment
    And User click button view your order history
    Then User have been finished to order and page link to order history

  Scenario: Normal scenario booking a room until the payment process with pay with your card paypal
    Given User open the home page
    When User Input "Indonesia" as location
    And  User choose hotel
    When User choose check in date and check out date
    And User click button search now
    And User click button book now
    And User click button proceed to checkout
    And User click button proceed1
    When User Input "anti" as firstName and "ri" as lastName and "saasw31@gmail.com" as email and "12345" as password and "09123112" as numberPhone and save
    And User click button proceed2
    And User click radio button i agree to the terms of service
    And User click button pay with your paypal
    And User click button i confirm my order
    Then User get a message successfully make payment
    And User click button view your order history
    Then User have been finished to order and page link to order history

  Scenario Outline: Normal scenario booking a room until the payment process with pay with personal info input scenario variations
    Given User open the home page
    When User Input "Indonesia" as location
    And  User choose hotel  
    When User choose check in date and check out date
    And User click button search now
    And User click button book now
    And User click button proceed to checkout
    And User click button proceed1
    When User Input "<firstName>" as firstName and "<lastName>" as lastName and "<email>" as email and "<password>" as password and "<numberPhone>" as numberPhone and save
    Then User see display "<error>" in display Rooms & Price Summary
Examples:
  | firstName | lastName | email        | password | numberPhone | error                |
  | asda      |          |              |          |             | There is 4 Error(s): |
  | asda      | casc     | anli@cad.com | 12345    |             | There is 1 Error(s): |
  |           | casc     | anli@cad.com | 12345    |             | There is 2 Error(s): |
  |           |          | anli@cad.com | 12345    |             | There is 3 Error(s): |
  | asda      | casc     |              | 12345    |             | There is 2 Error(s): |
  |           | casc     | anli@cad.com | 12345    | 082137312   | There is 1 Error(s): |
  |           | casc     | anli@cad.com | 12345    | 082137312   | There is 1 Error(s): |
  | asda      |          |              |          | 082137312   | There is 3 Error(s): |







