package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.Utilities;

public class DriverManager {
	
	public static WebDriver driver;
	
	
	/**
	 * @throws CustomException
	 * @Function-Below method is to set the browser based on the configuration 
	 */

	public static WebDriver setup() throws Exception
	{
		Utilities utils=new Utilities();
		String browser=utils.readPropertiesFile("browser");

		if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();

		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();

		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
		return driver;
	}
	
	public static WebDriver getCurrentDriver() {
		return driver;
	}

}
