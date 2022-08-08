Feature: Verifying to Add a New User' feature
  User Story: As a librarian , I should be able to add a new user

  @add_New_User @B26G32-123 @B26G32-108
  Scenario Outline: login as a librarian
    Given I am on the login page
    When I login using "<email>" and "<logInpassword>"
    Then I click on Users link
    And I click on +AddUser link
    When I enter "<full name>", "<password>", "<email address>"
    And I click save changes
    Then verify a new user created

    Examples:
      | email              | logInpassword | full name | password | email address     |
      | librarian1@library | qU9mrvur      | Saim      | Saim345  | saim@gmail.com    |
      | librarian2@library | uYrhHmmj      | Murodil   | Murodil  | murodil@gmail.com |
      | librarian3@library | DFvU4b1i      | Nadir     | Nadir    | nadir@gmail.com   |





