package org.malitcode.testCases;

import java.util.concurrent.TimeUnit;

import org.malitcode.pageObjects.AddToCartPageObjects;
import org.malitcode.pageObjects.LoginPageObjects;
import org.testng.annotations.Test;

public class AddToCart extends BaseClass{
	
	@Test
	public void addToCart() throws InterruptedException {
		
		driver.get(baseURL);
		logger.info("URL Opened");
		LoginPageObjects loginPageObj = new LoginPageObjects(driver);
		AddToCartPageObjects addtocartObjects =new  AddToCartPageObjects(driver);
		loginPageObj.setUsername("standard_user");
		loginPageObj.setPassWord("secret_sauce");
		loginPageObj.clickLoginBtn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		addtocartObjects.addFirstBag();
		addtocartObjects.addSecondBag();
		
		addtocartObjects.clickViewCart();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		addtocartObjects.clickFirstProd();
		
	}

}
