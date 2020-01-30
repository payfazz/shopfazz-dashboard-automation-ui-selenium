@MainMenu
Feature: Main menu feature on shopfazz
 
 Background: 
	Given user already in shopfazz login page 
	When user set username with "qa@automation.com" 
	And user set password with "123" 
	And click login button
	Then user could see dashboard title 

  @MainMenu1
  Scenario: Check click function on dashboard menu is working 
	When user click toggle button
	Then user will see main menu tittle
	When user click menu dashboard
	Then user will see dashboard page


  @MainMenu2
  Scenario: Check click function on pemesanan is working
  When user click toggle button 
  Then user will see main menu tittle
	When user click menu pemesanan
	Then user will see pemesanan page


 @MainMenu3
  Scenario: Check click function on pembelian is working 
	When user click toggle button
	Then user will see main menu tittle
	When user click menu pembelian
	Then user will see pembelian page
	
	@MainMenu4
  Scenario: Check click function on invetaris gudang is working 
  When user click toggle button
  Then user will see main menu tittle
	When user click menu inventaris gudang
	Then user will see inventaris gudang page

	@MainMenu5
  Scenario: Check click function on product is working 
  When user click toggle button
  Then user will see main menu tittle
	When user click menu product
	Then user will see product page
	
	@MainMenu6
  Scenario: Check click function on payment is working 
  When user click toggle button
  Then user will see main menu tittle
	When user click menu payment
	Then user will see payment page
	
	@MainMenu7
  Scenario: Check click function on customer is working 
  When user click toggle button
  Then user will see main menu tittle
	When user click menu customer
	Then user will see customer page
	
	@MainMenu8
  Scenario: Check click function on supplier is working 
  When user click toggle button
  Then user will see main menu tittle
	When user click menu supplier
	Then user will see supplier page
	
	@MainMenu9
  Scenario: Check click function on user management is working 
  When user click toggle button
  Then user will see main menu tittle
	When user click menu user management
	Then user will see user management page
	
	