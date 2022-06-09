package org.malitcode.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.malitcode.utilities.ReadConfig;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

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

	@Parameters("browser")
	@BeforeClass
	public void setUp(String br) {
		
		logger = Logger.getLogger("Swag Labs Automation");
		PropertyConfigurator.configure("Log4j.properties");
		
		// Launch required browser
		if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", readConfig.getChromePath());
			driver = new ChromeDriver();

		} else if (br.equals("fireFox")) {
			System.setProperty("webdriver.gecko.driver", readConfig.getGeckoPath());
			driver = new FirefoxDriver();

		} else if (br.equals("msEdge")) {
			System.setProperty("webdriver.edge.driver", readConfig.getMsEdgePath());
			driver = new EdgeDriver();
		}
		

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

	// Capture Screen if test case fails
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}

}
