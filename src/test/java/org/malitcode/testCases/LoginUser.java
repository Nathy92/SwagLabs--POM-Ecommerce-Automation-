package org.malitcode.testCases;

import org.malitcode.pageObjects.LoginPageObjects;
import org.testng.annotations.Test;

public class LoginUser extends BaseClass{
	
	@Test
	public void loginUser() throws InterruptedException {

		driver.get(baseURL);
		logger.info("Login User - URL Opened");
		LoginPageObjects loginPageObj = new LoginPageObjects(driver);
		loginPageObj.setUsername(username);
		logger.info("Login User - Username Entered");
		loginPageObj.setPassWord(password);
		logger.info("Login User - Password Entered");
		loginPageObj.clickLoginBtn();
		logger.info("Login User - Login Button Clicked");
		
	    loginPageObj.validateLogin();
	    		
	}
	

}
