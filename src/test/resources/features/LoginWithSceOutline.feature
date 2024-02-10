Feature: Login Functionality

  Scenario Outline:
    Given  user on homepage
    And login page should be visible
    When user enter username and password as follows
      | username | <username> |
      | password | <password> |
    And user clicks login button
    Then login should be "<status>"
    Examples:
      | username | password  | status |
      | admin    | admin123  | true   |
      | admin    |           | false  |
      |          | admin123  | false  |
      | admin    | admin1233 | false  |
      | admin 2  | admin123  | false  |
      | a        | a         | false  |
