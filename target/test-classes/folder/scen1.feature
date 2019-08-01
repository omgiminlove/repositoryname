Feature: Login Functionality
Description: Registered user login to the application by

Mapping: John would like to access the online shopping page. He should be registered and should use
registered credentials to get logged in to the application.

Scenario: Login with valid data
When user opens newtours appliaction on chrome browser
When user enters "mercury" As username and password
And Click on Submit button
Then veify login result