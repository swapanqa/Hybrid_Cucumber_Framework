Feature: Ecobags Login Functionality

Background:
Given Not a validated user
When User browse to website
Then Homepage should display
When User click login link
Then Browser display login page


Scenario: 1.Valid user with valid password

When User enter user email as "swapanny79@yahoo.com"
And User enter password as "ecobags2018"
And User click login button
Then Homepage should display
And Logout button should be present


Scenario: 2.Valid user with invalid password

When User enter user email as "swapanny79@yahoo.com"
And User enter password as "ecobag2018"
And User click login button 
Then login error message should display



Scenario: 3.Valid user logout

When User enter user email as "swapanny79@yahoo.com"
And User enter user password as "ecobags2018"
And User click login button 
Then Homepage should display 
And Logout button should be present 
When Usesr clicks logout button
Then logout success messege should display 

 
	 Scenario Outline: 3.Valid user with valid password Data Driven
	  Given Not a validated user
	  When User browse to the site
	  Then Ecobags home page should display
	  When User click login link
	  Then Browser display Login page
	  When User enter user email as "<EmailAddress>"
	  And User enter password as "<Password>"
	  And User click login button
	  Then Home page should display
	  And Login success message display
	 Examples:
      |EmailAddress        |Password    |
      |swapanny79@yahoo.com	 |ecobags2018 |
      |salmamamun91@gmail.com |ecobags91  |