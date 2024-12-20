#Author: Priyadharshini Boopalam
#Keywords Summary : Salesforce App - Edit the existing Account 
#Given Launch the browser and load the URL

Feature: Salesforce Application - Edit Account 

  Scenario: Salesforce Application - Edit Account
    When Enter the Salesforce user name as 'dilip@testleaf.com'
		And Enter the Password as 'leaf@2024'
		And Click on Login button
		Then Verify Login is successful
    When Click on toggle menu button from the left corner 
    When Click view All
    When Click Sales from App Launcher 
    When Click on Accounts tab 
    When Enter the account name in search textbox as 'Priyadharshini B'
	  When Click the dropdown icon next to the account 
	  And Select Edit option
		When Set Type to Technology Partner
		And Set Industry to Healthcare.
    And Enter the Billing Street as '123 Street'
    And Enter the Billing City as 'Chennai'
    And Enter the Billing Zip/Postal Code as '600000'
    And Enter the Billing State/Province as 'TamilNadu'
    And Enter the Billing Country as 'India'
    And Enter the Shipping Street as '456 Street'
    And Enter the Shipping City as 'Chennai'
    And Enter the Shipping Zip/Postal Code as '600001'
    And Enter the Shipping State/Province as 'TamilNadu'
    And Enter the Shipping Country as 'India'
 		And Set Customer Priority to Low
	  And Set SLA to Silver
	  And Set Active to NO
	  And Enter a unique number in the Phone field as '9876543210'
	  And Set Upsell Opportunity to No
	  And Click on save button 
	  And Verify the phone number