Feature: RS Online Application Test

Scenario: Validate Product CoaxialeCableCheckout Test

Given user is on HomePage
Then user selects Product
Then user clicks on Category
And user clicks on Product and AddToBasket and ViewBasket
Then user ChecksoutSecurely with Guest Login
And user lands on CheckoutPage

Scenario: Validate Product BatteriesCheckout Test
Given user is on HomePage
Then user selects Product Batteries
Then user clicks on BatteryHydroMeters
And user clicks on GlassBatteryHydrometer and AddToBasket and ViewBasket
Then user ChecksoutSecurely with Guest Login 
And user lands on CheckoutPage

Scenario: Testing first possible search scenario
Given user is on HomePage
Then user enters value Wire and selects Alpha Wire
Then user is Alpha Wire Result Page

Scenario: Testing sceond possible search scenario
Given user is on HomePage
Then user enters value Connectors and clicks on search button
Then user lands on Connectors Result Page

Scenario: Testing third possible search scenario
Given user is on HomePage
Then user enters value Wire and selects RS Pro Black
Then user lands on RS Pro Black Result Page
