Feature: Login Funcitoanality

  Scenario: Login with true credentials
    Given user on homepage
    And login page should be visible
    When user enter username and password as follows
      | username | admin    |
      | password | admin123 |
    And user clicks login button
    Then login should be succesfull
    Then quit from driver
