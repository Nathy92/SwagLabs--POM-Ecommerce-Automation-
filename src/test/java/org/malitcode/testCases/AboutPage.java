package org.malitcode.testCases;

import java.util.concurrent.TimeUnit;

import org.malitcode.pageObjects.LoginPageObjects;
import org.malitcode.pageObjects.SideBarObjects;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AboutPage extends BaseClass{
	
	@Test
	public void aboutPage() {
		
		driver.get(baseURL);
		logger.info("About Page - URL Opened");
		
		//1. Login 
		LoginPageObjects loginPageObj = new LoginPageObjects(driver);
		loginPageObj.setUsername("standard_user");
		logger.info("About Page - Username Entered");
		loginPageObj.setPassWord("secret_sauce");
		logger.info("About Page - Password Entered");
		loginPageObj.clickLoginBtn();
		logger.info("About Page - Login Button Clicked");
		
		//2. Click side link
		SideBarObjects sidebarObjects = new SideBarObjects(driver);
		sidebarObjects.clickSideBar();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		sidebarObjects.clickAboutBtn();
		logger.info("About Page - About Link Clicked");
		sidebarObjects.validatePageTitle(queryTitle);
		
	}

}
