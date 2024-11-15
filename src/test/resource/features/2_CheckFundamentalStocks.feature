@FundamentalPage
Feature: Check Fundamental stocks

  Background:
    Given user is on login page
    When user clicks on Login link
    And user enters valid credentials
    Then user should be logged in successfully

  Scenario: Verify fundamental stocks details are shown
    When user click on Submit button on fundamental page
    And click on Stocks tab
    And select two stocks from the list
    And click on toggle button
    And click on Submit tab
    Then report shoud be generated
    And browser should be closed
