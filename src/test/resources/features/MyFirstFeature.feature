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

Feature: My First Feature For Automation Practice Application

  
  Scenario: Validate Title Of The Application on Chrome
    Given User open Chrome Browser 
    And User open the url "http://automationpractice.com/index.php"
    When user is on landing page
    Then Title of the page is "My Store"
    And Browser get close




	Scenario: Validate Title Of The Application on Firefox
	    Given User open firefox Browser 
	    And User open the url "http://automationpractice.com/index.php"
	    When user is on landing page
	    Then Title of the page is "My Store"
	    And Browser get close

