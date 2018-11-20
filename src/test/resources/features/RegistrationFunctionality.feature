Feature: Registration Functionality


Background:

Given Not a valid user.
When User browser to the Ecobags website.
Then Ecobags home page will be display.

Scenario: User Registered for a new account
When User click My Account link
Then Login-Register form will be display
And User enter first name as "al"
And User enter last name as "shafee"
And User enter company name as "shafee.com"
And User enter email address as "mamunny79@gmail.com"
And User enter password as "shifa2015"
And User enter confirm password as "shifa2015"
When User click create account button
Then User will get welcome messege 

