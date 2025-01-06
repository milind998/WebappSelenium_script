# Author : Milind Ingale
# Date : 29/12/2023
# Description : Admin App Login page


Feature: Login
@tag1
Scenario: Check login is successful with valid credentials
Given user is on login page
When user enters username and password
And clicks on Login button
Then Admin Home page

@tag2:
Scenario: Check dashboard button text
Given Admin Home pages 
When check Dashboard button text is display
Then check dashboard button text

#@tag3:
#Scenario: Test Logout button functionality
#Given Admin Home page 
#When check Dashboard button text is display
#Then check Logout button functionality

#@tag4
#Scenario: Test Logout 
#Given Admin Home page 
#When check Dashboard button text is display
#When click on Logout button
#Then Check Login text



