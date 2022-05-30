package org.malitcode.testCases;

import java.util.concurrent.TimeUnit;

import org.malitcode.pageObjects.AddToCartPageObjects;
import org.malitcode.pageObjects.LoginPageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCart extends BaseClass {
	String item = "Sauce Labs Backpack";
	String price = "29.99";

	@Test
	public void addToCart() throws InterruptedException {

		driver.get(baseURL);
		logger.info("URL Opened");
		LoginPageObjects loginPageObj = new LoginPageObjects(driver);
		AddToCartPageObjects addtocartObjects = new AddToCartPageObjects(driver);
		loginPageObj.setUsername("standard_user");
		loginPageObj.setPassWord("secret_sauce");
		loginPageObj.clickLoginBtn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		addtocartObjects.addFirstBag();
		addtocartObjects.addSecondBag();

		addtocartObjects.clickViewCart();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		addtocartObjects.clickFirstProd();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		addtocartObjects.validateItem(item,price);
		

	}

}
