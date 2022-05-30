package org.malitcode.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;

public class AddToCartPageObjects {
	
	WebDriver ldriver;
	   
	//Constructor & Pagefactory
	public AddToCartPageObjects(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
		@FindBy(xpath ="//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
		@CacheLookup
		WebElement btnAddFirstBag;
		
		
		@FindBy(xpath ="//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")
		@CacheLookup
		WebElement btnAddSecondBag;
		
		@FindBy(xpath ="//*[@id=\"shopping_cart_container\"]/a/span")
		@CacheLookup
		WebElement btnViewCart;
		
		//Click 1-st product
		@FindBy(xpath ="//*[@id=\"item_4_title_link\"]/div")
		@CacheLookup
		WebElement clickFirstProd;
		
		@FindBy(xpath ="//div[@class=\"inventory_details_name large_size\" and text()='Sauce Labs Backpack']")
		@CacheLookup
		WebElement validateElem;
		
		@FindBy(xpath ="//div[@class=\"inventory_details_price\"]")
		@CacheLookup
		WebElement validatePrice;
		
		
		
		
		public void addFirstBag() {
			btnAddFirstBag.click();
		}
		
		public void addSecondBag() {
			btnAddSecondBag.click();
		}
		
		public void clickViewCart() {
			btnViewCart.click();
		}
		
		public void clickFirstProd() {
			clickFirstProd.click();
		}
		
		//Validate per item (Item name and Price)
		public void validateItem(String items, String price) {
			String price1 = validatePrice.getText();
			String item1 = validateElem.getText();

			if (item1.equals(items) &&  price1.equals(price)) {
				Assert.assertTrue(true);
			} else {
				Assert.assertFalse(false);
			}
		}
		
		
	
	
	

}
