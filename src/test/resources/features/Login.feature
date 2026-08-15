@searchEmployee @sprint12
Feature: Login

  @maven
  Scenario:
   Valid admin login

    When user enters valid admin username and password
    And user clicks on login button
    Then user is successfully added

  @regression @smoke
  Scenario:
  Valid ess login

    When user enter valid ess username and password
    And user clicks on login button
    Then ess user is successfully logged in
# enhancing test with Scenario Outline

  @smoke
  Scenario Outline:
    When user enters valid "<Username>" and "<Password>"
    And user clicks on login button
    Then "<FirstName>" user is successfully logged in

    Examples:
      | Username | Password  |
      | Admin    | hum12324@ |
      | dgg77    | Syntax123 |
      | dgfhfhfh | fdhdfhdh  |
# adding multiple employees using CucumberDataTable

  @inProgress
  Scenario:
Adding multiple employees

    When user enters employee details and click on save
      | FirstName | MiddleName |
      | John      | J          |
      | Jane      | T          |
    Then employee is added

  @regression
  Scenario:
Login with valid username and invalid password

    When user enters valid username and invalid password
    And user clicks on login button
    Then user sees invalid credentials text on login page

  @temp
  Scenario:
Login with invalid credentials

    When user enter valid ess username and password
      | UserName | Password   | ErrorMessage        |
      | Admin    | Admin123   | Invalid Credentials |
      | Hello    | Syntax123! | Invalid Credentials |
