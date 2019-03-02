Feature: Login LeafTaps
Background: 
Given Open chrome browser
And maximize the browser
And Enter the url
And Set the timeouts
And Enter the username
And Enter the password
When Click on Login button

Scenario: Positive Flow
Then Verify login is success

Scenario: CreateLead
Given Verify homepage is shown
When click on CRMSFA link
Then Verify if My home page shows
And click on Create Lead
And Enter company name
And Enter First name
And Enter last name
When click on Create Lead button
Then verify lead is success

Scenario: Negative Create Lead
Given Verify homepage is shown
When click on CRMSFA link
Then Verify if My home page shows
And click on Create Lead
And Enter First name
And Enter last name
When click on Create Lead button
Then verify lead is fail