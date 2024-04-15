Feature: Doctor details

  Scenario Outline: Search doctors
    Given the user is on practo homepage and clears the default location
    When the user selects the location as "<Location>"
    And searches for a speacialist as "<Specialist>"
    And the user applies various filters
    Then the user gets doctors details and prints it

    Examples: 
      | Location  | Specialist        |
      | Bangalore | General Physician |
