$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/sonalikarde/eclipse-workspace/RS_Automation/src/main/java/pom/qa/features/RS.feature");
formatter.feature({
  "line": 1,
  "name": "RS Online Application Test",
  "description": "",
  "id": "rs-online-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#Scenario: Validate Product CoaxialeCableCheckout Test"
    },
    {
      "line": 4,
      "value": "#"
    },
    {
      "line": 5,
      "value": "##Given user is on HomePage"
    },
    {
      "line": 6,
      "value": "##Then user selects Product"
    },
    {
      "line": 7,
      "value": "##Then user clicks on Category"
    },
    {
      "line": 8,
      "value": "##And user clicks on Product and AddToBasket and ViewBasket"
    },
    {
      "line": 9,
      "value": "##Then user ChecksoutSecurely with Guest Login"
    },
    {
      "line": 10,
      "value": "##And user lands on CheckoutPage"
    },
    {
      "line": 11,
      "value": "##"
    },
    {
      "line": 12,
      "value": "##Scenario: Validate Product BatteriesCheckout Test"
    },
    {
      "line": 13,
      "value": "##Given user is on HomePage"
    },
    {
      "line": 14,
      "value": "##Then user selects Product Batteries"
    },
    {
      "line": 15,
      "value": "##Then user clicks on BatteryHydroMeters"
    },
    {
      "line": 16,
      "value": "##And user clicks on GlassBatteryHydrometer and AddToBasket and ViewBasket"
    },
    {
      "line": 17,
      "value": "##Then user ChecksoutSecurely with Guest Login"
    },
    {
      "line": 18,
      "value": "##And user lands on CheckoutPage"
    }
  ],
  "line": 20,
  "name": "Testing first possible search scenario",
  "description": "",
  "id": "rs-online-application-test;testing-first-possible-search-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "user is on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "user enters value Wire and selects Alpha Wire",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "user is Alpha Wire Result Page",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductOneCheckoutSteps.user_is_on_HomePage()"
});
formatter.result({
  "duration": 7385056502,
  "status": "passed"
});
formatter.match({
  "location": "ProductOneCheckoutSteps.user_enters_value_Wire_and_selects_Alpha_Wire()"
});
formatter.result({
  "duration": 4127076520,
  "status": "passed"
});
formatter.match({
  "location": "ProductOneCheckoutSteps.user_is_Alpha_Wire_Result_Page()"
});
formatter.result({
  "duration": 116404,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Testing sceond possible search scenario",
  "description": "",
  "id": "rs-online-application-test;testing-sceond-possible-search-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "user is on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "user enters value Connectors and clicks on search button",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user lands on Connectors Result Page",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductOneCheckoutSteps.user_is_on_HomePage()"
});
formatter.result({
  "duration": 10399233147,
  "status": "passed"
});
formatter.match({
  "location": "ProductOneCheckoutSteps.user_enters_value_Connectors_and_clicks_on_search_button()"
});
formatter.result({
  "duration": 7205002675,
  "status": "passed"
});
formatter.match({
  "location": "ProductOneCheckoutSteps.user_lands_on_Connectors_Result_Page()"
});
formatter.result({
  "duration": 75850,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Testing third possible search scenario",
  "description": "",
  "id": "rs-online-application-test;testing-third-possible-search-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 31,
  "name": "user is on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "user enters value Wire and selects RS Pro Black",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "user lands on RS Pro Black Result Page",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductOneCheckoutSteps.user_is_on_HomePage()"
});
formatter.result({
  "duration": 5570492487,
  "status": "passed"
});
formatter.match({
  "location": "ProductOneCheckoutSteps.user_enters_value_Wire_and_selects_RS_Pro_Black()"
});
formatter.result({
  "duration": 7115719550,
  "status": "passed"
});
formatter.match({
  "location": "ProductOneCheckoutSteps.user_lands_on_RS_Pro_Black_Result_Page()"
});
formatter.result({
  "duration": 92815,
  "status": "passed"
});
});