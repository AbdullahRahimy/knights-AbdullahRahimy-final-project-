@Regression
Feature: Login in User Panel

  Scenario: Login and Validate CSR and Profile Information
    When Click Login Button
    And Login with username as "supervisor" and password as "tek_supervisor"
    Then Click SignIn Button
    #And Validate CSR credentials
    Then Click Profile Button
    And Validate profile information

  Scenario: Login and Click profile and LogOut
    When Click Login Button
    And Login with username as "supervisor" and password as "tek_supervisor"
    Then Click SignIn Button
    And Click Profile Button
    And Click LogOut
    When Validate Title and Login Button