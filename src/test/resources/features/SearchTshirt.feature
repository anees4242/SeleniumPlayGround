@Flipkart
Feature: Search for T-shirts Online shopping portal

As an online shopping user,
I need to login to flipkart 
In order to purchase a T-shirts online.

@SearchT-shirt
Scenario: search for T-shirt on flipkart
Given: The User should login with valid flipkart credentials
When: The User search for T-shirts on flipkart searchbar
Then: The User should be listed with "T-shirt"

Examples:
