Feature:
Employee Search

Scenario:
Search employee by ID

Given user navigated to HRMS
And user is logged in with valid admin credentials
And user navigates to Employee List page
When user enters valid employee id
And clicks on search button
Then users sees employee information is displayed

Scenario:
Given user navigated to HRMS
And user is logged in with valid admin credentials
And user navigates to Employee List page
When user enters valid employee name and last name
And clicks on search button
Then users sees employee information is displayed