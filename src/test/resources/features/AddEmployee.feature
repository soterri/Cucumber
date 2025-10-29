Feature: 
Add New Employee

Background: 
Given user is logged in with valid admin credentials
And user navigates to Add Employee page

Scenario:
Add Employee with first name and lastname
When user enters employees "Terri" and "Thach"
And user clicks on save button
Then "Terri Thach" employee is added successfully

Scenario:
Add Employee without employee ID
When user enters employees first and last name
And user deletes employee id
And user clicks on save button
Then employee is added succesfully

Scenario:
Add Employee and create login credentials
When user enters employees first name and last name
And user clicks on create login checkbox
And user clicks on save button
Then employee is added successfully

#to perform DDT in cucumber we use scneario outline with Examples
@working
Scenario Outline:
Adding multiple employees
When user enters employees "<FirstName>", "<MiddleName>", and "<LastName>"
And user clicks on save button
Then "<FirstName>", "<MiddleName>", and "<LastName>" is added succesfully

Examples:
|FirstName|MiddleName|LastName|
|James|J|Smith|
|John|A|Bitch|
|Terri|WillBe|Successful|





