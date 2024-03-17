@Bagpurchase
Feature: Purchase
  This feature is for purchasing item from
  Scenario: Login with valid username and password
    Given User open the web sauce demo
    When User input "standard_user" as userName and "secret_sauce" as password and click login
    Then User already on dashboard page
    When User sort product by "Price (low to high)"
    And User add to click button add to cart item "Sauce Labs Bike Light"
    And User add to click button add to cart item "Sauce Labs Onesie"
    And User click cart button
    And User remove Sauce Labs Bike Light by clicking remove button
    And user click checkout button
    And User input "Alvin" as first name, "diarma" as last name, and "12345" as postal code and click continue
    And User click finish
    Then User land on Checkout complete page