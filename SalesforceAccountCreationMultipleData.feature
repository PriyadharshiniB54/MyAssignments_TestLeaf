#Author: Priyadharshini Boopalam
#Keywords Summary : Salesforce App - Account creation with multiple data 
#Given Launch the browser and load the URL

Feature: Salesforce Application - Account Creation with multiple data 

Scenario Outline: Salesforce Application - Account Creation with multiple data 
    When Enter the Salesforce user name as 'dilip@testleaf.com'
		And Enter the Password as 'leaf@2024'
		And Click on Login button
		Then Verify Login is successful
    When Click on toggle menu button from the left corner 
    When Click view All
    When Click Sales from App Launcher 
    When Click on Accounts tab 
    When Click on New button
    When Enter <AccountName> as account name 
    And Select Ownership as Public
		And Click on save button 
		Then verify Account name
Examples:
|AccountName|
|'Priyadharshini B'|
|'Priya'|
|'Krithik'|
|'PriyaLok'|