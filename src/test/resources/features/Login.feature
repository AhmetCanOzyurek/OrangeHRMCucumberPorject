Feature: Login Funcitoanality

  Scenario: Login
    Given User on homepage
    And Login page should be visible
    When User enter username and password as follows
      | username | admin    |
      | password | admin123 |
    And user clicks login button
    Then Login should be succesfull
    Then quit from driver
