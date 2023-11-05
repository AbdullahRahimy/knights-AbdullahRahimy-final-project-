@Regression
Feature: Validation of Title and Login Button
  Scenario: Navigate and Validate
    When Validate Title and Login Button
  @smoke
  Scenario: Primary Account Button
    When Click to Primary Account Button
    Then Validate Title Create Primary Account Holder
@smoke
  Scenario: Primary Account Creation
    When Click to Primary Account Button
    And Fill Up the Form
    Then Click Create Account
    And Validate sign up page and email address
  @smoke
  Scenario: Validate error Message with existing email
    When Click to Primary Account Button
    And Fill Up the Form with Existed Email
    Then Click Create Account
    And Validate the error message
