Feature: Google Home Page Validation

@smoke
Scenario: Verify Searchbutton

Given user launch browser and open URL "https://www.google.com" using selenium
When User click on searchbox
Then User verigy page title is "Google"
When User click on Gmail link
Then User verify page title is "Gmail"
And I verify the page is correct








