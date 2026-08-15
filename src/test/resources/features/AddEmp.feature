Feature: Add Employee

Background:
Given user enters valid username and password
And user clicks on login button
Then user is able to see dashboard page
When user clicks on PIM option
And user clicks on Add employee options

Scenario: Adding the employee by firstname and lastname 
And user enters firstname and lastname
And user clicks on save button
Then employee is added succesfully

@excel
Scenario: 
Adding employees using excel file
When user add multiple employees from excel file