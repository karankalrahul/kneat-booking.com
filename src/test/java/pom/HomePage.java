package pom;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.CommonActions;
import common.DriverManager;

public class HomePage {


	private CommonActions commonActions = null;

	/**
	 * Constructor for HomePage
	 * @throws Exception 
	 */

	public HomePage() {

		commonActions = new CommonActions();
		PageFactory.initElements(DriverManager.getCurrentDriver(), this);

	}

	/**
	 * Locators are starting from here, Identifying all the locators present on the
	 * page
	 */

	@FindBy(xpath="//label[@id='xp__guests__toggle']")
	private WebElement guestsInputsLocator;

	@FindBy(css = "#xp__guests__inputs-container")
	private WebElement guestInputsBox;

	@FindBy(xpath="//span[contains(text(),'Search')]")
	private WebElement searchButton;

	@FindBy(xpath = "//div[@data-bui-ref='calendar-next']")
	private WebElement calenderNextMonth;

	@FindBy(xpath="//*[@id='xp__guests__inputs-container']/div/div/div[3]/div/div[2]/span[1]")
	private WebElement presentRoomCount;

	@FindBy(xpath = "//button[@aria-label='Increase number of Rooms']")
	private WebElement incrementTheRoom;

	@FindBy(xpath = "//button[@aria-label='Decrease number of Rooms']")
	private WebElement decreaseTheRoom;

	@FindBy(xpath="//*[@id='xp__guests__inputs-container']/div/div/div[2]/div/div[2]/span[1]")
	private WebElement presentChildrenCount;

	@FindBy(xpath = "//button[@aria-label='Increase number of Children']")
	private WebElement incrementTheChildren;

	@FindBy(xpath = "//button[@aria-label='Decrease number of Children']")
	private WebElement decreaseTheChildren;

	@FindBy(css = ".bui-calendar__content")
	private WebElement calendarLocator;
	
	@FindBy(xpath="//*[@id='xp__guests__inputs-container']/div/div/div[1]/div/div[2]/span[1]")
	private WebElement presentGuestCount;

	@FindBy(xpath = "//button[@aria-label='Increase number of Adults']")
	private WebElement incrementTheAdult;

	@FindBy(xpath = "//button[@aria-label='Decrease number of Adults']")
	private WebElement decreaseTheAdult;
	
	@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']")
	private WebElement acceptCookieDesignOne;

	@FindBy(xpath="//*[@id='cookie_warning']/div/div/div[2]/button")
	private WebElement acceptCookieDesignTwo;

	@FindBy(xpath="//button[@id='onetrust-reject-all-handler']")
	private WebElement declineCookie;

	@FindBy(xpath="//div[@id='onetrust-banner-sdk']")
	private List< WebElement> theAcceptCookiePopUp;

	@FindBy(xpath="//input[@type='search']")
	private WebElement location;

	@FindBy(xpath="//div[contains(@class, 'b-datepicker')][@data-mode='checkin']")
	private WebElement checkInLocator;
	
	
	
	/**
	 * @throws CustomException
	 * @Function-Below method is to get Page Title
	 */

	
	public String verifyHomePageTitle() throws Exception{
		return DriverManager.getCurrentDriver().getTitle();
	}

	
	/**
	 * @throws CustomException
	 * @Function-Below method is to increment child count
	 */
	
	public void incrementChildren() throws Exception {
		commonActions.waitForElementDisplayed(incrementTheChildren, 60);
		commonActions.clickOnWebElement(incrementTheChildren);
	}

	/**
	 * @throws CustomException
	 * @Function-Below method is to decrease child count
	 */
	
	public void decreaseChildren() throws Exception {
		commonActions.waitForElementDisplayed(decreaseTheChildren, 60);
		commonActions.clickOnWebElement(decreaseTheChildren);
	}

	/**
	 * @throws CustomException
	 * @Function-Below method is read current count of children
	 */
	
	public String GetPresentChildrenCount() throws Exception {
		commonActions.waitForElementDisplayed(presentChildrenCount, 60);
		return commonActions.getText(presentChildrenCount);

	}
	
	/**
	 * @throws CustomException
	 * @Function-Below method is to increment adult count
	 */
	

	public void incrementAdult() throws Exception {
		commonActions.waitForElementDisplayed(incrementTheAdult, 60);
		commonActions.clickOnWebElement(incrementTheAdult);
	}
	
	/**
	 * @throws CustomException
	 * @Function-Below method is to decrease adult count
	 */
	
	public void decreaseAdults() throws Exception {
		commonActions.waitForElementDisplayed(decreaseTheAdult, 60);
		commonActions.clickOnWebElement(decreaseTheAdult);
	}
	
	
	/**
	 * @throws CustomException
	 * @Function-Below method is to read current adult count
	 */
	
	public String getPresentGuestCount() throws Exception {
		commonActions.waitForElementDisplayed(presentGuestCount, 60);
		return commonActions.getText(presentGuestCount);

	}
	
	/**
	 * @throws CustomException
	 * @Function-Below method is to increment room count
	 */
	

	public void incrementRooms() throws Exception {
		commonActions.waitForElementDisplayed(incrementTheRoom, 60);
		commonActions.clickOnWebElement(incrementTheRoom);
	}
	
	/**
	 * @throws CustomException
	 * @Function-Below method is to decrease child count
	 */
	

	public void decreaseRooms() throws Exception {
		commonActions.waitForElementDisplayed(decreaseTheRoom, 60);
		commonActions.clickOnWebElement(decreaseTheRoom);
	}
	
	/**
	 * @throws CustomException
	 * @Function-Below method is to read current room count
	 */

	public String getPresentRoomCount() throws Exception {
		commonActions.waitForElementDisplayed(presentRoomCount, 60);
		return commonActions.getText(presentRoomCount);
	}
	
	/**
	 * @throws CustomException
	 * @Function-Below method is to click on next month from the calendar
	 */
	
	public void selectCalenderNextMonth() throws Exception {
		commonActions.waitForElementDisplayed(calenderNextMonth, 60);
		commonActions.clickOnWebElement(calenderNextMonth);
	}
	
	/**
	 * @throws CustomException
	 * @Function-Below method is to click on CheckIn icon
	 */

	public void clickOnCheckIn() throws Exception{
		commonActions.waitForElementDisplayed(checkInLocator, 60);
		commonActions.clickOnWebElement(checkInLocator);

	}

	public void waitForCalendarToDisplay() throws Exception{
		commonActions.waitForElementDisplayed(calendarLocator,60);
	}
	
	/**
	 * @throws CustomException
	 * @Function-Below method is to click on Calendar icon
	 */

	public void selectCalenderIcon() throws Exception {
		this.clickOnCheckIn();
		this.waitForCalendarToDisplay();
	}

	/**
	 * @throws CustomException
	 * @Function-Below method is to click on Search Button
	 */

	public void clickOnSearchButton() throws Exception{
		commonActions.clickOnWebElement(searchButton);

	}
	
	/**
	 * @throws CustomException
	 * @Function-Below method is to click on Guests input box
	 */

	public void clickOnGuestsInput() throws Exception{
		commonActions.waitForElementDisplayed(guestsInputsLocator, 60);
		commonActions.clickOnWebElement(guestsInputsLocator);

	}
	
	public void waitForGguestInputsBox() throws Exception{
		commonActions.waitForElementDisplayed(guestInputsBox, 60);
	
	}

	public void selectGuestInputsBoxIcon() throws Exception {
		this.clickOnGuestsInput();
		this.waitForGguestInputsBox();
	}

	
	/**
	 * @throws CustomException
	 * @Function-Below method is to click on Decline Cookies button
	 */
	public void clickOnDeclineCookies() throws Exception{
		commonActions.waitForElementDisplayed(declineCookie, 60);
		commonActions.clickOnWebElement(declineCookie);
	}  
	
	/**
	 * @throws CustomException
	 * @Function-Below method is to click on Accept Cookies button
	 */

	public void clickOnAcceptCookieDesignOne() throws Exception{
		commonActions.waitForElementDisplayed(acceptCookieDesignOne, 60);
		commonActions.clickOnWebElement(acceptCookieDesignOne);

	}
	
	/**
	 * @throws CustomException
	 * @Function-Below method is to click on Accept Cookies button from second d site
	 */

	public void clickOnAcceptCookieDesignTwo() throws Exception{
		commonActions.waitForElementDisplayed(acceptCookieDesignTwo, 60);
		commonActions.clickOnWebElement(acceptCookieDesignTwo);

	}
	
	/**
	 * @throws CustomException
	 * @Function-Below method is to click on Accept Cookies pop-up
	 */

	public void clickOnAcceptCookiePopUp() throws Exception{

		if(theAcceptCookiePopUp.size() !=0) {
			this.clickOnAcceptCookieDesignOne();

		} else {
			this.clickOnAcceptCookieDesignTwo();

		}
	}  

	/**
	 * @throws CustomException
	 * @Function-Below method is to enter location
	 */
	
	public void enterLocation(String setLocation) throws Exception{
		commonActions.enterTextInTextBox(location, setLocation);

	}

	public void setLocationDetails(String setLocation) throws Exception{

		this.enterLocation(setLocation);
	}
	

	/**
	 * @throws CustomException
	 * @Function-Below method is to select reservation date
	 */
	
	public void selectReservationDates() throws Exception {
		this.selectCalenderIcon();
		LocalDate today = LocalDate.now();
		LocalDate reservationStartDate = today.plusMonths(3);
		LocalDate reservationEndDate=reservationStartDate.plusDays(1);

		String reservationStart=reservationStartDate.getMonth().toString().toLowerCase();
		String reservationStartMonth = reservationStart.substring(0, 1).toUpperCase() + reservationStart.substring(1);

		List<WebElement> nextMonthSelection;
		try {
			do {
				nextMonthSelection=DriverManager.getCurrentDriver().findElements(By.xpath("//div[contains(text(),'"+reservationStartMonth+"')]"));
				if(nextMonthSelection.size() < 1) {

					this.selectCalenderNextMonth();
				}
			} while(nextMonthSelection.size() < 1); 

		} catch (NoSuchElementException e) {
			System.out.println("The month of reservation is not found");
		}
		calculateDate(DriverManager.getCurrentDriver(), reservationStartDate);
		calculateDate(DriverManager.getCurrentDriver(), reservationEndDate);
	}
	
	/**
	 * @throws CustomException
	 * @Function-Below method is to select guest details
	 */

	public void selectGuestDetails(int adults, int rooms, int children ) throws Exception {
		this.selectGuestInputsBoxIcon();

		int theAdults=0;
		do {

			String adultDetail=getPresentGuestCount();
			theAdults=Integer.parseInt(adultDetail);

			if(!(theAdults == adults)) {

				if(theAdults < adults) {

					incrementAdult();

				} else {

					decreaseAdults();
				}
			}
		} while(!(theAdults == adults));

		int room=0;
		do {

			String roomDetails=getPresentRoomCount();
			room=Integer.parseInt(roomDetails);

			if(!(room == rooms)) {

				if(room < rooms) {

					incrementRooms();	
				} else {
					decreaseRooms();

				}
			}
		} while(!(room == rooms));

		int child=0;
		do {

			String childrenDetails=GetPresentChildrenCount();
			System.out.println("childrenDetails"+ childrenDetails);
			children=Integer.parseInt(childrenDetails);

			if(!(child == children)) {

				if(child < children) {
					incrementChildren();

				} else {
					decreaseChildren();

				}
			}
		} while(!(child == children));
	}

	/**
	 * @throws CustomException
	 * @Function-Below method is to select reservation date
	 */
	
	private static void calculateDate(WebDriver driver, LocalDate dateToSelect) {

		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		WebDriverWait wait = new WebDriverWait(driver, 5, 5);

		By dateLocator = By.xpath(String.format("//td[@data-date='%s']", formatter.format(dateToSelect)));
		wait.until(ExpectedConditions.visibilityOfElementLocated(dateLocator)).click();
	}

	
}

