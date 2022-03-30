@HomePage
Feature: Home Page
  This feature will check the overall appearance of the scenario of home page

Scenario: Make sure button home clickable and link to next page
  Given User open the home page
  And User click button nav toggle
  And User click button home
  Then User can see the home screen

Scenario: Make sure button interior clickable and link to next page
  Given User open the home page
  And User click button nav toggle
  And User click button interior
  Then User can see the interior screen

Scenario: Make sure button amenities clickable and link to next page
  Given User open the home page
  And User click button nav toggle
  And User click button amenities
  Then User can see the amenities screen

Scenario: Make sure button rooms clickable and link to next page
  Given User open the home page
  And User click button nav toggle
  And User click button rooms
  Then User can see the rooms screen

Scenario: Make sure button testimonials clickable and link to next page
  Given User open the home page
  And User click button nav toggle
  And User click button testimonials
  Then User can see the testimonials screen

Scenario: Make sure button legal notice clickable and link to next page
  Given User open the home page
  And User click button nav toggle
  And User click button legal notice
  Then User can see the legal notice screen

Scenario: Make sure button about us clickable and link to next page
  Given User open the home page
  And User click button nav toggle
  And User click button about us
  Then User can see the about us screen

  Scenario: Make sure button contact clickable and link to next page
    Given User open the home page
    And User click button nav toggle
    And User click button contact
    Then User can see the contact us screen







