@Login
Feature: Login to website

  Scenario: Login is successfull with valid credentials
    Given user is on login page
    When user enters valid credentials
    Then user should be logged in successfully
    And browser should be closed
