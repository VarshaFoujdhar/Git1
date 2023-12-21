@Sanity
Feature: Validating login scenario

  Scenario Outline: Login into the application
    Given User logins into the application
    And User will enter the "<Username>"
    And user will Enter the "<Password>"
    When user will click on the login button
    Then User will be navigated to home page.

    Examples: 
      | Username   | Password |
      | mngr542801 | Yzetuza  |