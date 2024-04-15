Feature: Invalid Email

  Scenario: Fill the form with incorrect email
    Given the users clicks on For Corporates option
    And the user clicks on the health and wellness option
    When the user provides incorrect email
    Then the schedule a demo button should be disabled
