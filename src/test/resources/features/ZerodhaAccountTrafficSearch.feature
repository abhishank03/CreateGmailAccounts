#Author: abhishankTiwari
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Zerodha search via google search engine
  I want to use this template for my feature file

  @Zerodha @Blogging
  Scenario Outline: Title of your scenario outline
    Given I initialize chrome driver
    When I navigate to google search engine
    And I search given text "<text>"
    Then I select netizensays
    And I spend "<amountTime>" on this blog
  #  And I quit

    Examples: 
      | text                               | amountTime |
      | अपने Zerodha अकाउंट में नॉमिनी जरूर जोड़िये |          2 |
