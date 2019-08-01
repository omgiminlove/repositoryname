$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/folder/scen4.feature");
formatter.feature({
  "name": "flight booking through online site",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "flight login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@dryrun"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "user login to flight booking site",
  "keyword": "When "
});
formatter.match({
  "location": "class4.user_login_to_flight_booking_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify login to flight booking site is success",
  "keyword": "And "
});
formatter.match({
  "location": "class4.verify_login_to_flight_booking_site_is_success()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "search flight",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@search"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "user searches flight giving required detials",
  "keyword": "When "
});
formatter.match({
  "location": "class4.user_searches_flight_giving_required_detials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify search related flight is dispalyed",
  "keyword": "And "
});
formatter.match({
  "location": "class4.verify_search_related_flight_is_dispalyed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Order Flight",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@order"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "user clicks on order button",
  "keyword": "When "
});
formatter.match({
  "location": "class4.user_clicks_on_order_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify Flight details get added to cart",
  "keyword": "And "
});
formatter.match({
  "location": "class4.verify_Flight_details_get_added_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Payment",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@payment"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "user clicks cart",
  "keyword": "When "
});
formatter.match({
  "location": "class4.user_clicks_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify payment page is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "class4.verify_payment_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects netbanking",
  "keyword": "And "
});
formatter.match({
  "location": "class4.user_selects_netbanking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user completes payment",
  "keyword": "Then "
});
formatter.match({
  "location": "class4.user_completes_payment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify payment success",
  "keyword": "Then "
});
formatter.match({
  "location": "class4.verify_payment_success()"
});
formatter.result({
  "status": "passed"
});
});