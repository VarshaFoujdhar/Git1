@regression1
Feature: Create new customer

  Background: Login into application
    Given User logins into the application
    And User will enter the "mngr542801"
    And user will Enter the "Yzetuza"
    When user will click on the login button
    Then User will be navigated to home page.

  Scenario Outline: creating a new customer
    Given User is landed on the homepage of the application.
    And User will click on the New Customer link
    And User will enter the customer name as  "<CName>"
    And User will select Gender
    And user will enter the Date of birth "<DOB>"
    And user will enter the address "<Addr>"
    And user will enter the city name "<City>"
    And user will enter the State name "<State>"
    And user will enter the pin name "<pin>"
    And user will enter the mobile number "<mnumber>"
    And user will enter the email number "<email>"
    And user will enter the password "<pwd>"
    When user will click on the submit button.
    Then new customer id is created successfully.
    Then get the customer id to edit the customer.

    Examples: 
      | CName  | DOB        | Addr         | City   | State     | pin    | mnumber | email        | pwd     |
      | Varsha | 02-04-1998 | Kalyan nagar | Hospet | Karnataka | 583201 |  123456 | 123password@gmail.com | Varsha1 |
