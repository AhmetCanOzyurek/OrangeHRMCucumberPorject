Feature: Login Page Functionality

  Scenario: social media direction
    Given user on homepage
    When user clicks social media button as follows
      | linkedin | facebook | twitter | youtube |
    And social media page should be visible
    Then user come back login page