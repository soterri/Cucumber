Feature:
Name validations against DataBase

Scenario:
First Name validation against DB
Given user is logged in with valid admin credentials
And user navigates to Employee List page
When user enters valid employee id "1045"
And clicks on search button
Then verify table is displayed
And get first name from table
When get first name from db
Then validate first name from ui againsts db
