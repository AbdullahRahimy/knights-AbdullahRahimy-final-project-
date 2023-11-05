Feature: Navigate to Accounts page with Valid USR
@Regression
  Scenario: Navigate to Accounts and Validate 5 data present in Accounts
    When Click Login Button
    And Login with username as "supervisor" and password as "tek_supervisor"
    Then Click SignIn Button
    And Click Accounts Button
    And Validate 5 data is present in Accounts
  @Regression
  Scenario: Navigate and change show per page to 10, 25, 50 and validate
    When Click Login Button
    And Login with username as "supervisor" and password as "tek_supervisor"
    Then Click SignIn Button
    And Click Accounts Button
    And Change the Show Per Page to 10 and Validate
    And then change to 25 and Validate
    And and to 50 and Validate


