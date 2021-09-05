Feature: Signup verification


@multipletestdata
Scenario Outline: Verify signup with multiple username and password
Given User launch and Open "<url>"
When User enter username "<Username>"
And User enter password "<Password>"

Examples:
|url |Username | Password |
| http://demo.automationtesting.in/SignIn.html | merlin | pass1 |
| http://demo.automationtesting.in/SignIn.html | saru | pass2 |
| http://demo.automationtesting.in/SignIn.html | kavi | pass3 |
| http://demo.automationtesting.in/SignIn.html | sivaranjini | pass4 |




