package org.malitcode.testCases;

import org.malitcode.pageObjects.FiltersPageObjects;
import org.malitcode.pageObjects.LoginPageObjects;
import org.testng.annotations.Test;

public class Filters extends BaseClass{
	
	@Test
	public void filster() {
		FiltersPageObjects filterPageObj =  new FiltersPageObjects(driver);
		LoginPageObjects loginPage = new LoginPageObjects(driver);
		
		driver.get(baseURL);
		logger.info("Filter - URL Opened");
		loginPage.clickLoginBtn();
		loginPage.setUsername(username);
		logger.info("Filter - Username Captured");
		loginPage.setPassWord(password);
		loginPage.clickLoginBtn();
		logger.info("Filter - Password Captured");
		
		filterPageObj.selectDropDown();
		
		
	}

}
