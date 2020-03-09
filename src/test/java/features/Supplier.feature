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

@C184292 @C184296 @C184297
Scenario: User search with wrong input on the supplier list 
  When user input with "Juki==+__+_+_$" 
	And user click search button 
	Then user will see data not found	

@C184293
Scenario: User search with email on the supplier list 
  When user input with "saya@mail.com" 
	And user click search button 
	Then user will see data not found	

@C184294
Scenario: User search with address on the supplier list 
  When user input with "Kuningan" 
	And user click search button 
	Then user will see data not found	
	
@C184295
Scenario: User search with address on the supplier list 
  When user input with "Kuningan" 
	And user click search button 
	Then user will see data not found	
		
@C184298
Scenario: User search with supplier name listed on the supplier list 
  When user input with "Jaya Mukti" 
	And user click search button 
	Then user will see supplier name
	