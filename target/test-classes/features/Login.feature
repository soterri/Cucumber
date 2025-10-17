@searchEmployee @sprint12
Feature: Login

@smoke @validLogin
Scenario:
Valid admin login
Given user navigated to HRMS
When user enters valid admin username and password
And user clicks on login button
Then admin user is succesfully logged in

@smoke
Scenario:
Valid ess login
Given user navigated to HRMS
When user enter valid ess username and password
And user clicks on login button
Then ess user is successfully logged in

@regression
Scenario:
Login with valid username and invalid password
Given user navigated to HRMS
When user enters valid username and invalid password
And user clicks on login button
Then user sees invalid credentials text on login page