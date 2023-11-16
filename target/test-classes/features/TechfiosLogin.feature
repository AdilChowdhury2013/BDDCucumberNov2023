@Regression
Feature:  Techfios Other billing login page functionality validation

Background:
Given User is on the techfios login page

@Sanity
Scenario Outline: User should be able to login with valid credentials 
When User enters the username as "<username>" in the "username" field
When User enters the password as "<password>" in the "password" field
When User clicks on the signin button
Then User should land on dashboard page


Examples:
|username|password|
|demo@techfios.com|abc123|
|demo1@techfios.com|abc123|
|demo@techfios.com|abc124|

 






