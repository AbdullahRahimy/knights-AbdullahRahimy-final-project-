Feature: Navigate to Plans page with Valid USR
@US_10
  Scenario: Navigate and validate Customer service portal and 4 data present in plans
    When Click Login Button
    And Login with username as "supervisor" and password as "tek_supervisor"
    Then Click SignIn Button
    Then Validate User Navigate to Customer Service Portal
    And Click Plans Button
    Then Validate 4 data is present

  Scenario Outline: Navigate to Plans and Validate Date Created for DATATable
    When Click Login Button
    And Login with username as "supervisor" and password as "tek_supervisor"
    Then Click SignIn Button
    And Click Plans Button
    Then Validate Date Created for DATATable "<CreatedDate>" and "<ExpiryDate>"

    Examples:
    |CreatedDate|ExpiryDate|
    |October 31, 2023|November 1, 2023|
