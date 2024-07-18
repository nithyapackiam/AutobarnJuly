

Feature: Validate the forgotten password functionality
@Regression
Scenario: validate with Invalid username and Invalid password
# Given user should open the chrome and the url----due to hooks before annotation

When click the signin button
When user should click the forgotten password link
And user should enter invalid mobile number
And user should get the current url of the page
Then validate user should navigate to password reset page
