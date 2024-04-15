Feature: Invalid name

  Scenario: Fill the form with incorrect name
    Given the users clicks on For Corporates option
    And the user clicks on the health and wellness option
    When the user provides incorrect name
    Then the schedule a demo button should be disabled
