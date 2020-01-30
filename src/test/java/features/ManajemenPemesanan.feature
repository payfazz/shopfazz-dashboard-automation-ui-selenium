@ManajemenPemesanan
Feature: Shopfazz dashboard management pesanan feature. As an user of shopfazz dashboard,  I want to be able to use feature on shopfazz dashboard
  
Background: 
	Given user already in shopfazz login page 
	When user set correct username and password
	And click login button
	And click toggle button
	And click menu Pemesanan 
	Then see header title "Manajemen Pemesanan"
	
@C2372
Scenario: Check searching function based on sales code in head of sales(hos) tab
	When user click tab "hos"
	When user "hos" set the "Code" in search input text 
	Then user will see row with sales "Code" is matched with input keyword
