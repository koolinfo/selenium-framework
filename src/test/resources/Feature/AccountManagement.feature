@AccountManagement
Feature: Account Management

  @CreateAccount
  Scenario Outline: Create an account using a valid email address
    Given I am on create an account page
    When I enter "<Firstname>" "<Lastname>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on create an account
    Then My account page is displayed

    Examples:
      | Firstname | Lastname | Email                     | Password | ConfirmPassword |
      | Michael   | Tester   | michael.tester@tester.com | !1Tester | !1Tester        |



  @AccountLogin
  Scenario Outline: Registered Customer can Login in with UserName and Password
    Given I am a registered customer
    And I am on LoginPage
    When I enter "<Firstname>" "<Lastname>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on sign button
    Then My account page is displayed

    Examples:
      | Firstname | Lastname | Email                     | Password | ConfirmPassword |
      | Michael   | Tester   | michael.tester@tester.com | !1Tester | !1Tester        |