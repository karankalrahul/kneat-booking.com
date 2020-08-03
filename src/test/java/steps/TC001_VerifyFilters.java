package steps;

import org.junit.Assert;

import common.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.HomePage;
import pom.HotelListingPage;
import utilities.Utilities;

public class TC001_VerifyFilters {

	Utilities utilities=new Utilities();

	@Given("User has launched the booking.com website")
	public void user_has_launched_the_booking_com_website() throws Exception {

		DriverManager.setup();
		DriverManager.getCurrentDriver().get(utilities.readPropertiesFile("applicationUrl"));
		DriverManager.getCurrentDriver().manage().window().maximize();

	}

	@When("User selects the booking details as location {string} with {int} adults {int} room and {int} children")
	public void user_selects_the_booking_details_as_location_with_adults_room_and_childrens(String location, int countAdults, int countRooms , int countChildren) throws Exception {
		new HomePage().setLocationDetails(location);
		new HomePage().selectReservationDates();
		new HomePage().selectGuestDetails(countAdults, countRooms, countChildren);
	   
	}

	@When("User searches for the hotels")
	public void user_searches_for_the_hotels() throws Exception {
		new HomePage().clickOnSearchButton();
	  
	}

	@Then("User is navigated to hotel listing page")
	public void user_is_navigated_to_hotel_listing_page() throws Exception {
		
		String pageTtile=new HotelListingPage().verifyHotelPageTitle();
		Assert.assertEquals("Validating Page Title", "Booking.com: Hotels in Limerick. Book your hotel now!", pageTtile);
	  
	}

	@Then("User selects filter as {string}")
	public void user_selects_filter_as(String filter) throws Exception {
		new HotelListingPage().selectFiler(filter);
	}

	@Then("User verifies the hotel listing for {string} {string}")
	public void user_verifies_the_hotel_listing_for(String hotelName, String availabilityStatus) throws Exception {
		new HotelListingPage().checkForHotel(hotelName, availabilityStatus);

	}
	
	@Then("User clicks on Fitness Centre filter")
	public void user_clicks_on_Fitness_Centre_filter() throws Exception {
		new HotelListingPage().selectFitnessCentreFilter();
	}

	@Then("User closes the browser")
	public void user_closes_borwser() throws Exception {
		DriverManager.getCurrentDriver().quit();
	}
}
