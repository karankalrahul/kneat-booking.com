Feature: Validation of newly added filters on the booking.com

@SmokeTest
Scenario Outline: Verify booking.com search filter for 5 stars

	Given User has launched the booking.com website
	When  User selects the booking details as location "Limerick" with 2 adults 1 room and 0 children
	And   User searches for the hotels
	Then  User is navigated to hotel listing page
	And   User selects filter as "<Filter_Name>" 
	And   User verifies the hotel listing for "<Hotel_Name>" "<Is_Listed>"
	Then  User closes the browser
	
Examples:
	| Filter_Name | Hotel_Name            | Is_Listed |
	| 5 stars     | The Savoy Hotel       | True      |
	| 5 stars     | George Limerick Hotel | False     |


@SmokeTest
Scenario Outline: Verify booking.com search filter for Sauna under Fitness Centre

  Given User has launched the booking.com website
	When  User selects the booking details as location "Limerick" with 2 adults 1 room and 0 children
	And   User searches for the hotels
	Then  User is navigated to hotel listing page
	And 	User clicks on Fitness Centre filter
	And   User selects filter as "<Filter_Name>" 
	And   User verifies the hotel listing for "<Hotel_Name>" "<Is_Listed>"
	Then  User closes the browser
	
Examples:
	| Filter_Name | Hotel_Name            | Is_Listed |
	| Sauna       | Limerick Strand Hotel | True      |
	| Sauna       | George Limerick Hotel | False     |