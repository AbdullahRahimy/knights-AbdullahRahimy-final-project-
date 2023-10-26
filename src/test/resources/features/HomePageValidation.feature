Feature: Validation of Title and Login Button
  Scenario: Navigate and Validate
    When Validate Title and Login Button

  Scenario: Primary Account Button
    When Click to Primary Account Button
    Then Validate Title Create Primary Account Holder

  Scenario: Primary Account Creation
    When Click to Primary Account Button
    And Fill Up the Form
    Then Click Create Account
    And Validate sign up page and email address
