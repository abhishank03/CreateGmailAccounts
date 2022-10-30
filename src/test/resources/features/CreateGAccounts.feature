#Author: your.email@your.domain.com
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
@emailID
Feature: Title of your feature
  I want to use this template for my feature file

  @gmail
  Scenario Outline: Title of your scenario outline
    Given I initialize chrome driver
    And I am navigating to gmail signup url
    When I click on create account button
    Then I provide account creation related details with "<FirstName>"  ,"<LastName>" , "<Username>" ,"<Passwd>" , "<ConfirmPasswd>"

    Examples: 
      | FirstName | LastName | Username     | Passwd    | ConfirmPasswd |
      | Abhishek     | Tiwari  | abhishek19 | Imhere03# | Imhere03#     |
