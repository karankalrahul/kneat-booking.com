package common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonActions extends DriverManager{

	/**
	 * @throws CustomException
	 * @Function-Below method is to click on Web Element 
	 */
	
	public void clickOnWebElement(WebElement element) throws Exception {
		element.click();
	}

	/**
	 * @throws CustomException
	 * @Function-Below method is to enter text in text box
	 */
	
	public void enterTextInTextBox(WebElement element, String text) throws Exception {
		element.sendKeys(text);
	}

	/**
	 * @throws CustomException
	 * @Function-Below method is to wait element displayed
	 */
	
	public void waitForElementDisplayed(WebElement element, int explicitWaitSeconds) throws Exception {
		WebDriverWait wait = new WebDriverWait(DriverManager.getCurrentDriver(), explicitWaitSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * @throws CustomException
	 * @Function-Below method is to get text from web element
	 */
	
	public String getText(WebElement element) {
		return element.getText();
	}


	
}


