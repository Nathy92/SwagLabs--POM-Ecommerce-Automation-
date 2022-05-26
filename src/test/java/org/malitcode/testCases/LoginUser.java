package org.malitcode.testCases;

import org.malitcode.pageObjects.LoginPageObjects;
import org.testng.annotations.Test;

public class LoginUser extends BaseClass{
	
	@Test
	public void loginUser() throws InterruptedException {

		driver.get(baseURL);
		logger.info("URL Opened");
		LoginPageObjects loginPageObj = new LoginPageObjects(driver);
		loginPageObj.setUsername("standard_user");
		loginPageObj.setPassWord("secret_sauce");
		loginPageObj.clickLoginBtn();
		
	}
	

}
