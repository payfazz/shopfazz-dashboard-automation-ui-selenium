@LoginDashboard @RegressionTesting
Feature: shopfazz dashboard login 

Background:
Given user already in shopfazz login page

@C25264 
Scenario: as a user I want to login using registered account 
	When user set username with "qa@automation.com" 
	And user set password with "123" 
	And click login button 
	Then user could see dashboard title 
	When user click profile button 
	And user click logout 
	Then user logged out from system 