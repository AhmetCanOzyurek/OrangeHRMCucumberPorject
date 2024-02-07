Feature: Login functionality

  Scenario: Login with false credentials
    Given user on homepage
    And login page should be visible
    When user enter username and password as follows
      | username | admin1   |
      | password | admin321 |
    And user clicks login button
    Then login should be failed and invalid  credentials text should be visible
    Then quit from driver

