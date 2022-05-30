package org.malitcode.testCases;

import java.util.concurrent.TimeUnit;

import org.malitcode.pageObjects.AddToCartPageObjects;
import org.malitcode.pageObjects.LoginPageObjects;
import org.malitcode.pageObjects.SideBarObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCart extends BaseClass {
	
	//Product Item & price
	static String item = "Sauce Labs Backpack";
	static String price = "29.99";

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
        
		//View Cart
		addtocartObjects.clickViewCart();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		addtocartObjects.clickFirstProd();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Validate Item & Price
		addtocartObjects.validateItem(item,price);
		
		//Click Side bar
		SideBarObjects sidebarObjects = new SideBarObjects(driver);
		sidebarObjects.clickSideBar();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		sidebarObjects.clickLogout();
	
		 

	}

}
