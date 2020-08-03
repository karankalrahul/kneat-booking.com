package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import common.CommonActions;
import common.DriverManager;


public class HotelListingPage {



	private CommonActions commonActions = null;
	
	/**
	 * Constructor for HotelListingPage
	 * @throws Exception 
	 */

	public HotelListingPage() {

		commonActions = new CommonActions();
		PageFactory.initElements(DriverManager.getCurrentDriver(), this);

	}

	/**
	 * Locators are starting from here, Identifying all the locators present on the
	 * page
	 */

	@FindBy(xpath="//h2[@class='filter_by']")
	private WebElement filterBy;
	
	@FindBy(xpath="//span[contains(text(),'Sauna')]")
	private WebElement filterSauna;

	@FindBy(xpath="//span[contains(text(),'5 stars')]")
	private WebElement filterStar;
	
	@FindBy(xpath="//a[@data-name='popular_activities']//span[contains(text(),'Fitness')]")
	private WebElement fitnessFilter;

	
	/**
	 * @throws CustomException
	 * @Function-Below method is to validate Page Title
	 */
	
	public String verifyHotelPageTitle() throws Exception{
		commonActions.waitForElementDisplayed(filterBy, 60);
		return DriverManager.getCurrentDriver().getTitle();
	}
	
	/**
	 * @throws CustomException
	 * @Function-Below method is to select filter
	 */

	public void selectFiler(String filterName) throws Exception {
		DriverManager.getCurrentDriver().navigate().refresh();
		commonActions.waitForElementDisplayed(fitnessFilter, 60);
		WebElement filter = DriverManager.getCurrentDriver().findElement(By.xpath("//span[contains(text(),'"+filterName+"')]"));
		commonActions.waitForElementDisplayed(filter, 60);
		commonActions.clickOnWebElement(filter);

	}
	
	/**
	 * @throws CustomException
	 * @Function-Below method is to select filter
	 */

	public void selectFitnessCentreFilter() throws Exception {

		commonActions.waitForElementDisplayed(fitnessFilter, 60);
		commonActions.clickOnWebElement(fitnessFilter);

	}

	/**
	 * @throws CustomException
	 * @Function-Below method is to check Hotel
	 */


	public void checkForHotel(String hotel, String status) throws Exception {

		List<WebElement> list=DriverManager.getCurrentDriver().findElements(By.cssSelector(".sr-hotel__name"));

		for(WebElement ele:list) {

			String hotelName=ele.getText();
			if(hotelName.equalsIgnoreCase(hotel)) {

				status="True";
				System.out.println("Hotel is available and verified =  "+hotelName+ "  Is Listed = "+status);
				break;

			} else {

				status="False";

			}
		}

		if(status=="False") {

			System.out.println("Hotel is not available = "+hotel+ "   Is Listed = " + status);
		}
	}

}