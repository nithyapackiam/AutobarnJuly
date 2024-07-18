
Feature: Validate the login functionality of my autobarn

Background:

When  you should click the signin button


# Given user should open the chrome browser and launch the url--due to hooks before annotation

@Smoke
Scenario: validate with invalid email and invalid password

When user should enter invalid username and the invalid password
And user should click login button
And user should get the title of the webpage
Then validate user should navigate to incorrect credential page

@Sanity @Smoke
Scenario Outline: validate with valid username and invalid password
When user should enter valid username "<name>" and invalid password"<pass>"
And user should click button
And you should get the current url of the webpage
Then validate user should navigate to incorrect credential page


Examples:

|name|pass|
|Arun@546|Arunkumar|
|vignersh@123|234567|

@Regression
Scenario: validate with invalid email and valid password
When You should enter invalid username and valid Password
#1D----List(Without header)
|sql|sql@125|manual|manual@456|selenium|selenium@6789|


And user should click login button
Then validate user should navigate to incorrect credential page

@Sanity
Scenario: validate with invalid email and invalid password
When You should enter invalid username value and invalid Password

#2D----List(Without header)
|sql|sql@125|manual|manual@456|selenium|selenium@6789|
|java|java@125|cucumber|cucumber@456|Testing|Testing@6789|
|table|table@125|chair|chair@456|pillow|pillow@6789|

And user should click login button
Then validate user should navigate to incorrect credential page

@Smoke @Regression
Scenario: validate with invalid email and invalid password
When Enter the invalid username and invalid Password

#1D---Map(With header)
|mobile  |mobile@125 |
|laptop |Laptop@125|
|mouse|mouse@125|

And user should click login button
Then validate user should navigate to incorrect credential page

@Sanity

Scenario: validate the invalid email and password
When You should enter the invalid username and invalid Password

#2D---Map(With header)
|course|  mail   |test    |link        |name			|id						|
|sql   |sql@125  |manual  |manual@456  | selenium |selenium@6789|
|java  |java@125 |cucumber|cucumber@456|Testing   |Testing@6789 |
|table |table@125|chair   |chair@456   |pillow    |pillow@6789  |

And user should click login button
Then validate user should navigate to incorrect credential page
