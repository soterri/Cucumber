@searchEmployee @sprint13
Feature:Employee Search

Background:
Given user is logged in with valid admin credentials
And user navigates to Employee List page

@smoke
Scenario:
Search employee by ID
When user enters valid employee id "45454"
And clicks on search button
Then users sees employee information is displayed

@regression
Scenario:
When user enters valid employee "Terri" and "Thach"
And clicks on search button
Then users sees employee information is displayed