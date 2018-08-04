Feature: Create a New Lead

Background:
Given Open the Browser
And maximize the window
And Load the leaftaps URL
And Set the TimeOut

@sanity
Scenario Outline: Create a Successful Lead
Given Enter the UserName as <userName>
And Enter the Password as <password>

And Click on LogIn Button
And Click on crmsfa link 
And Click on Leads
And Click On Create Lead
And Enter the Company Name as <cName>
And Enter the firstName as <fName>
And Enter the lastName as <lName> 
When Click On Create Lead Button 
Then Verify Login Is Succesful
And Verify Create Lead Is Successful


Examples:
|userName|password|cName|fName|lName|
|demoSalesManager|crmsfa|A|B|C|
|demoCSR|crmsfa|D|E|F|
@smoke
Scenario: Create a Failed Lead
Given Enter the UserName as DemoSalesManager
And Enter the Password as crmsfa1
When Click on LogIn Button
Then Verify Login IS Not Successful