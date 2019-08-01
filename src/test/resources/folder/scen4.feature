Feature: flight booking through online site

@login @dryrun @regression
Scenario: flight login
When user login to flight booking site
And verify login to flight booking site is success

@search @regression
Scenario: search flight
When user searches flight giving required detials
And verify search related flight is dispalyed

@order @regression
Scenario: Order Flight
When user clicks on order button
And verify Flight details get added to cart

@payment @regression
Scenario: Payment
When user clicks cart
And verify payment page is displayed
And user selects netbanking
Then user completes payment
Then verify payment success