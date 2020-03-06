@MainMenu
Feature: Main menu feature on shopfazz
 
Background: 
	Given user already in shopfazz login page 
	When user set username with "qa@automation.com" 
	And user set password with "123" 
	And click login button
	Then user could see dashboard title 

@C25273
Scenario: Check click function on hide main menu is working
  When user click side bar menu
  Then user will see main menu title
	When user click close menu
	Then user will see shopfazz logo

@C25275
Scenario: Check click function on pemesanan is working
  When user click side bar menu
  Then user will see main menu title
	When user click menu pemesanan
	Then user will see pemesanan page
	
@C184615
Scenario: Check click function on BAST is working
  When user click side bar menu
  Then user will see main menu title
	When user click menu BAST
	Then user will see BAST page

@C25276
Scenario: Check click function on pembelian is working 
	When user click side bar menu
	Then user will see main menu title
	When user click menu pembelian
	Then user will see pembelian page
	
@C99227
Scenario: Check click function on invetaris gudang is working 
  When user click side bar menu
  Then user will see main menu title
	When user click menu inventaris gudang
	Then user will see inventaris gudang page
	
@C25277
Scenario: Check click function on product is working 
  When user click side bar menu
  Then user will see main menu title
	When user click menu product
	Then user will see product page
	
@C46970
Scenario: Check click function on payment is working 
  When user click side bar menu
  Then user will see main menu title
	When user click menu payment
	Then user will see payment page
	
@C25279
Scenario: Check click function on customer is working 
  When user click side bar menu
  Then user will see main menu title
	When user click menu customer
	Then user will see customer page
	
@C25280
Scenario: Check click function on supplier is working 
  When user click side bar menu
  Then user will see main menu title
	When user click menu supplier
	Then user will see supplier page
	
@C25281
Scenario: Check click function on user management is working 
  When user click side bar menu
  Then user will see main menu title
	When user click menu user management
	Then user will see user management page
	
@C25274
Scenario: Check click function on dashboard menu is working 	
	When user click side bar menu
  Then user will see main menu title
	When user click menu pemesanan
	Then user will see pemesanan page
	When user click side bar menu
	Then user will see main menu title
	When user click menu dashboard
	Then user will see dashboard page
	
@C25285
Scenario: Check click function on Logout dashboard is working 	
	When user click profile button 
	And user click logout 
	Then user logged out from system 