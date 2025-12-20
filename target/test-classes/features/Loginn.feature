# Author terri@gmail.com
@sprint5 @login
Feature: login

  @smoke
  Scenario Outline:
valid admin and ess login

    When user enter "<Username>" and "<Password>"
    And user clicks on login button
    Then "<FirstName>" is successfully logged in

    Examples:
      | Username | Password    | FirstName   |
      | Terri    | Hello123!   | Sotheary    |
      | John     | isABitch123 | Chanthavong |

  @regression
  Scenario Outline:
Error message validation while invalid login

    When user enters "<Username>" and "<Password>"
    And user clicks on login button
    Then user sees "<Error Message>"

    Examples:
      | Username | Password | ErrorMessage             |
      | Admn     | Admin123 | Invalid Credentials      |
      | Hello    | Syntax13 | Invalid Credentials      |
      | Admin    |          | Password cannot be empty |
