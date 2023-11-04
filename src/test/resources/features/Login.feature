Feature: Login and Message Validation

  Scenario: Login and SignIn
  When Click Login Button
  And Login with username as "supervisor" and password as "tek_supervisor"
  Then Click SignIn Button
  Then Validate User Navigate to Customer Service Portal

   Scenario Outline: LogIn with incorrect Password
     When Click Login Button
     And Login with username as "<Username>" and password as "<Password>"
     Then Click SignIn Button
     Then Validate Error Message

     Examples:
     |Username|Password|
     |supervisor|Incorrect|
     |Incorrect |tek_supervisor|
