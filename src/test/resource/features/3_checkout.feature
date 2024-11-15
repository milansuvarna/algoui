@Checkout
Feature: user checkout from the cart page

  Background:
    Given user is on login page
    When user enters valid credentials
    And user click on add product
    And user go in the cart

  Scenario: user checkout from the page
    Given user is on cart page
    When user clicks on checkout page
    Then user is reditected to checkout information page
    And user enters checkout information
    And user clicks on continue
    And browser should be closed
