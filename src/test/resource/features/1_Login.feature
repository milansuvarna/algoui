@Login
Feature: Login to website

  Scenario Outline: Login is successfull with valid credentials
    Given user is on login page
    When user enters valid username "<username>" and  password"<password>"
    Then user should be logged in successfully
    And browser should be closed

  Example:
    |username| |password|
    |standard_user| |secret_sauce|
    |locked_out_user| |secret_sauce|
    |problem_user| |secret_sauce|
    |performance_glitch_user| |secret_sauce|
