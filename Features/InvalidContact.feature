Feature: Invalid contact number

  Scenario: Fill the form with invalid Phonenumber
    Given the users clicks on For Corporates option
    And the user clicks on the health and wellness option
    When the user provides incorrect phonenumber
    Then the schedule a demo button should be disabled
