@AddToCart
Feature: Add the product in the cart

  Scenario: Click on Add products and verify if the product is added in the cart
    Given user is on login page
    When user enters valid credentials
    And user click on add product
    And user go in the cart
    Then product should be displayed in the cart
    And browser should be closed
