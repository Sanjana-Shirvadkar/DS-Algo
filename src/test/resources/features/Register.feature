Feature: Register
  
Scenario: Registration scenario
   	Given User is on the home page
    When title is NumpyNinja
    Then User clicks on Register Link
    Then user is on Registration page
		
		Then user enters <Username> and <Password> and <Password confirmation> 
				| Username | Tester09| 
				| Password | Test@123 | 
				| Password_Confirmation | Test@123 |  
				
		Then user clicks "Register button"


