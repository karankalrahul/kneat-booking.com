$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/TC001_VerifyFilters.feature");
formatter.feature({
  "name": "Validation of newly added filters on the booking.com",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify booking.com search filter for 5 stars",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User has launched the booking.com website",
  "keyword": "Given "
});
formatter.step({
  "name": "User selects the booking details as location \"Limerick\" with 2 adults 1 room and 0 children",
  "keyword": "When "
});
formatter.step({
  "name": "User searches for the hotels",
  "keyword": "And "
});
formatter.step({
  "name": "User is navigated to hotel listing page",
  "keyword": "Then "
});
formatter.step({
  "name": "User selects filter as \"\u003cFilter_Name\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User verifies the hotel listing for \"\u003cHotel_Name\u003e\" \"\u003cIs_Listed\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User closes the browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Filter_Name",
        "Hotel_Name",
        "Is_Listed"
      ]
    },
    {
      "cells": [
        "5 stars",
        "The Savoy Hotel",
        "True"
      ]
    },
    {
      "cells": [
        "5 stars",
        "George Limerick Hotel",
        "False"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify booking.com search filter for 5 stars",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User has launched the booking.com website",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.TC001_VerifyFilters.user_has_launched_the_booking_com_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects the booking details as location \"Limerick\" with 2 adults 1 room and 0 children",
  "keyword": "When "
});
formatter.match({
  "location": "steps.TC001_VerifyFilters.user_selects_the_booking_details_as_location_with_adults_room_and_childrens(java.lang.String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searches for the hotels",
  "keyword": "And "
});
formatter.match({
  "location": "steps.TC001_VerifyFilters.user_searches_for_the_hotels()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is navigated to hotel listing page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.TC001_VerifyFilters.user_is_navigated_to_hotel_listing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects filter as \"5 stars\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.TC001_VerifyFilters.user_selects_filter_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies the hotel listing for \"The Savoy Hotel\" \"True\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.TC001_VerifyFilters.user_verifies_the_hotel_listing_for(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User closes the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.TC001_VerifyFilters.user_closes_borwser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify booking.com search filter for 5 stars",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User has launched the booking.com website",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.TC001_VerifyFilters.user_has_launched_the_booking_com_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects the booking details as location \"Limerick\" with 2 adults 1 room and 0 children",
  "keyword": "When "
});
formatter.match({
  "location": "steps.TC001_VerifyFilters.user_selects_the_booking_details_as_location_with_adults_room_and_childrens(java.lang.String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searches for the hotels",
  "keyword": "And "
});
formatter.match({
  "location": "steps.TC001_VerifyFilters.user_searches_for_the_hotels()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is navigated to hotel listing page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.TC001_VerifyFilters.user_is_navigated_to_hotel_listing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects filter as \"5 stars\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.TC001_VerifyFilters.user_selects_filter_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies the hotel listing for \"George Limerick Hotel\" \"False\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.TC001_VerifyFilters.user_verifies_the_hotel_listing_for(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User closes the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.TC001_VerifyFilters.user_closes_borwser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify booking.com search filter for Sauna under Fitness Centre",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User has launched the booking.com website",
  "keyword": "Given "
});
formatter.step({
  "name": "User selects the booking details as location \"Limerick\" with 2 adults 1 room and 0 children",
  "keyword": "When "
});
formatter.step({
  "name": "User searches for the hotels",
  "keyword": "And "
});
formatter.step({
  "name": "User is navigated to hotel listing page",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on Fitness Centre filter",
  "keyword": "And "
});
formatter.step({
  "name": "User selects filter as \"\u003cFilter_Name\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User verifies the hotel listing for \"\u003cHotel_Name\u003e\" \"\u003cIs_Listed\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User closes the browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Filter_Name",
        "Hotel_Name",
        "Is_Listed"
      ]
    },
    {
      "cells": [
        "Sauna",
        "Limerick Strand Hotel",
        "True"
      ]
    },
    {
      "cells": [
        "Sauna",
        "George Limerick Hotel",
        "False"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify booking.com search filter for Sauna under Fitness Centre",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User has launched the booking.com website",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.TC001_VerifyFilters.user_has_launched_the_booking_com_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects the booking details as location \"Limerick\" with 2 adults 1 room and 0 children",
  "keyword": "When "
});
formatter.match({
  "location": "steps.TC001_VerifyFilters.user_selects_the_booking_details_as_location_with_adults_room_and_childrens(java.lang.String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searches for the hotels",
  "keyword": "And "
});
formatter.match({
  "location": "steps.TC001_VerifyFilters.user_searches_for_the_hotels()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is navigated to hotel listing page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.TC001_VerifyFilters.user_is_navigated_to_hotel_listing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Fitness Centre filter",
  "keyword": "And "
});
formatter.match({
  "location": "steps.TC001_VerifyFilters.user_clicks_on_Fitness_Centre_filter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects filter as \"Sauna\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.TC001_VerifyFilters.user_selects_filter_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies the hotel listing for \"Limerick Strand Hotel\" \"True\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.TC001_VerifyFilters.user_verifies_the_hotel_listing_for(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User closes the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.TC001_VerifyFilters.user_closes_borwser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify booking.com search filter for Sauna under Fitness Centre",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User has launched the booking.com website",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.TC001_VerifyFilters.user_has_launched_the_booking_com_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects the booking details as location \"Limerick\" with 2 adults 1 room and 0 children",
  "keyword": "When "
});
formatter.match({
  "location": "steps.TC001_VerifyFilters.user_selects_the_booking_details_as_location_with_adults_room_and_childrens(java.lang.String,int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searches for the hotels",
  "keyword": "And "
});
formatter.match({
  "location": "steps.TC001_VerifyFilters.user_searches_for_the_hotels()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is navigated to hotel listing page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.TC001_VerifyFilters.user_is_navigated_to_hotel_listing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Fitness Centre filter",
  "keyword": "And "
});
formatter.match({
  "location": "steps.TC001_VerifyFilters.user_clicks_on_Fitness_Centre_filter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects filter as \"Sauna\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.TC001_VerifyFilters.user_selects_filter_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies the hotel listing for \"George Limerick Hotel\" \"False\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.TC001_VerifyFilters.user_verifies_the_hotel_listing_for(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User closes the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.TC001_VerifyFilters.user_closes_borwser()"
});
formatter.result({
  "status": "passed"
});
});