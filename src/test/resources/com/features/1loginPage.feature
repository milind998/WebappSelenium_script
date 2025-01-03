# Description : Admin App Login page

Feature: Login
@tag1
Scenario: Check login is successful with valid credentials
Given user is on login page
When user enters username and password
And clicks on Login button
Then Admin Home page

