@LoginFeature @Regression
Feature:  Techfios login functionally validation

Background:
Given User is on Techfios login page
@Smoke
Scenario Outline: User should be able to login with valid credential
When User enters the username as "<username>"
When User enters the password as "<password>"
When User clicks on the signin button
Then User should land on dashboard page

Examples:
|username|password|
|demo@techfios.com|abc123|
|demo1@techfios.com|abc123|
|demo@techfios.com|abc124|



