Feature: Product Add to shopping cart.


Background:

Given Not a valid user
When  User browser to the website.
Then Ecobags home page will be display


Scenario: User Add product to shopping cart.

When User move cursor to Brands link button.
Then Brands item will be drop down 
And User  select a category as "Chicabag"
Then chicobag page will be display
And user select color
And User select quentity
Then User click add to cart button
Then chicobag item should be add.
