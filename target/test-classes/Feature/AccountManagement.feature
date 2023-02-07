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
      | Michael   | Tester   | michael1.tester@tester.com | !1Tester | !1Tester        |