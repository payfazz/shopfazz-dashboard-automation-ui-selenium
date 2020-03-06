@Supplier
Feature: Supplier feature on shopfazz
 
Background: 
	Given user already in shopfazz login page 
	When user set username with "qa@automation.com" 
	And user set password with "123" 
	And click login button
	Then user could see dashboard title 
	When user click side bar menu
  Then user will see main menu title
	When user click menu supplier
	Then user will see supplier page
	
@C184298
Scenario: User search with supplier name listed on the supplier list 
  When user input with "Jaya Mukti" 
	And user click search button 
	Then user will see supplier name