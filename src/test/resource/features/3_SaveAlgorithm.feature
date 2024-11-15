@SaveAlgoPage
Feature: Saved algorithm page

  Background:
    Given user is on login page
    When user clicks on Login link
    And user enters valid credentials
    Then user should be logged in successfully

  Scenario: verify simulation is saved in in saved algorithm
    When user click on Submit button on fundamental page
    And click on Stocks tab
    And select two stocks from the list
    And click on toggle button
    And click on Submit tab
    Then report shoud be generated
    And user click in Save simulation tab
    And user enter simulation name and click save
    And browser should be closed
