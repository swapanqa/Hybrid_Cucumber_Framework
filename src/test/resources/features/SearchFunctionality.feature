Feature: Website Search Feature


Scenario: 1.User searches for specific organic item

Given Not a validated user
When User browse to website
Then Homepage should display
When User enters searchword as "organic"
And User click search button
Then Search results title page should display
And All items should contain organic in the product title