@googleSearch
Feature: Search engine
  
  As an internet user,
  I need to have a search engine,
  In order to look for resources online.

  @validSearch
  Scenario: Valid keyword search
    Given the user is on home page
    When the user searches for "shoes"
    Then the user should be listed with relevant results

  @validSearches
  Scenario Outline: Valid keyword search
    Given the user is on home page
    When the user searches for <keyword>
    Then the user should be listed with relevant results

    Examples: 
      | keyword      |
      | "cypress"    |
      | "playwright" |
      | "shoes"      |
