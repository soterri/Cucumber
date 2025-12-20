#Author: Terri@deloitteoutlook.com
Feature: Dashboard

Scenario: Dashboard menu view for Admin
When user is logged in with valid admin credentials
Then user see dashboard menu is displayed
|Admin|Pim|Leave|Time|Recruitment|Performance|Dashboard|Directory|



#Example of a US for Cucumber
#US 55454: As an admin, user should see 8 dashboard menus displayed
#Admin
#Pim
#Leave
#Time
#Recruitment
#Performance
#Dashboard
#Directory
