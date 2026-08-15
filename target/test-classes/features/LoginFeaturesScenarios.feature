Feature: Login related scenarios

  Scenario: valid admin login
    Given user is able to access hrms application
    When user enters valid username and password
    And user clicks on login button
    Then user is able to see dashboard page
    And user "Terri" and "Thach" sees dashboard


@example
  Scenario Outline: Adding multiple employees
    And user add "<firstname>", "<middlename>", and "<lastname>"
    And user clicks on save button
    Then employee is added succesfully

    Examples:
      | firstname | middlename | lastname |
      | terri     | successful | thach    |
      
      
      
# and would be supporting the previous tag associated
