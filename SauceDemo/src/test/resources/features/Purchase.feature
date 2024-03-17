@Purchase
Feature: Purchase

  Scenario: Login with valid username and password
    Given User open the web sauce demo
    When User input "standard_user" as userName and "secret_sauce" as password and click login
    Then User already on dashboard page
    When User sort product by "Price (high to low)"
    And User add to click button add to cart item "Sauce Labs Backpack"
    And User add to click button add to cart item "Sauce Labs Bike Light"