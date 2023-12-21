@regression3
Feature: Create new customer

  Background: Login into application
    Given User logins into the application
    And User will enter the "mngr542801"
    And user will Enter the "Yzetuza"
    When user will click on the login button
    Then User will be navigated to home page.
    
    Scenario Outline: delete the customer.
    Given User landed on the home page.
    And User will click on delete cutomer link.
    And User will enter customer id to be deleted "<Cid>".
    And user will click on submit button to delete customer.
    Then user will click ok on the alert message and capture the message.

    Examples: 
      | Cid   |
      | 87931 |
      
      