@LoginDashboard @RegressionTesting
Feature: shopfazz dashboard login 

Background:
Given user already in shopfazz login page

@C25256 
Scenario: as a user I want to login without input email 
	When user set password with "123"
	Then login button disable

@C25257 
Scenario: as a user I want to login without input password 
	When user set username with "qa@shopfazz.com"
	And click login button
	Then login button disable
	
@C25258 
Scenario: as a user I want to login without input email and password 
	When click login button
	Then login button disable

@C25260 
Scenario: as a user I want to login with unregistered account 
	When user set username with "email@salah.com"
	When user set password with "tes1234567890"
	And click login button 
	Then user will get error message invalid credential 

@C25261 
Scenario: as a user I want to login with invalid email 
	When user set username with "qaaaaaaaaaaaaaa@shopfazz.com"
	When user set password with "123"
	And click login button 
	Then user will get error message invalid credential 

@C25262 
Scenario: as a user I want to login with invalid password 
	When user set username with "qa@shopfazz.com"
	When user set password with "1234567890"
	And click login button 
	Then user will get error message invalid credential 

@C25263 
Scenario: as a user I want to login with email and password exchanged 
	When user set username with "123"
	When user set password with "qa@shopfazz.com"
	And click login button 
	Then user will get error message invalid credential

@C25265 
Scenario: as a user I want to see password
	When user set username with "123"
	When user set password with "qa@shopfazz.com" 
	And user click toggle password button
	Then user will see password as "qa@shopfazz.com"

@C25264 @C111018
Scenario: as a user I want to login using registered account
	When user set username with "qa@shopfazz.com" 
	And user set password with "123" 
	And click login button 
	Then user could see dashboard title 
	When user click profile button 
	And user click logout 
	Then user logged out from system 
		
@C25259 
Scenario: as a user I want to login using registered account with lowercase and uppercase email
	When user set username with "qA@shOpFaZz.cOm" 
	And user set password with "123" 
	And click login button 
	Then user could see dashboard title 
	When user click profile button 
	And user click logout 
	Then user logged out from system 