@regression2
Feature: Create new customer

  Background: Login into application
    Given User logins into the application
    And User will enter the "mngr542801"
    And user will Enter the "Yzetuza"
    When user will click on the login button
    Then User will be navigated to home page.

  Scenario Outline: Editing the new customer
    Given User landed on the home page.
    And User will click on edit cutomer link.
    And User will enter customer id "<Cid>".
    And user will click on submit button.
    Then user should click ok on the alert message.

    Examples: 
      | Cid   |
      | 87931 |
