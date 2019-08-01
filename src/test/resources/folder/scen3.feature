Feature: Testme logins with different set of data

Description: Registered user login to the application by multiple inputs

Mapping: John would like to access the online shopping page. He should be registered and should use
registered credentials to get logged in to the application.

Scenario Outline: Login with multiple inputs - TestMeApp
Given  user opens test me app home page
When user clicks sign in 
And user enters username as "<username>" and the password as "<password>" 
And Click on the login button
Then Validate the result now

Examples:
|username|password|
|lalitha|password123|
|lalitha|password456|
