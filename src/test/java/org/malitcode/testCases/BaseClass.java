package org.malitcode.testCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.malitcode.utilities.ReadConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


/*
 * @Author: Nkosi Malala 
 * Project: SwagLabs
 */
public class BaseClass {
 
	ReadConfig readConfig = new ReadConfig();
	public WebDriver driver;
	
	public static String username = "standard_user";
	public static String password = "secret_sauce";
	
	public static String queryTitle = "Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs";
	public static Logger logger;
	public String baseURL = readConfig.getApplicationURL();

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", readConfig.getChromePath());
		driver = new ChromeDriver();
		logger = Logger.getLogger("Swag Labs Automation");
		PropertyConfigurator.configure("Log4j.properties");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	// validation method
	public boolean validateItemName(String nameItem) {
		return driver.getPageSource().contains(nameItem);
	}

	public boolean validateItemPrice(String price) {
		return driver.getPageSource().contains(price);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
