Feature: Order Management

  Scenario Outline: Duplicate account creation not allowed
    Given I am on create an account pagee
    When I enter active account "<Firstname>" "<Lastname>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on createe an account
    Then Error message should be displayed

    Examples:
      | Firstname | Lastname | Email                     | Password | ConfirmPassword |
      | Michael   | Tester   | michael.tester@tester.com | !1Tester | !1Tester        |