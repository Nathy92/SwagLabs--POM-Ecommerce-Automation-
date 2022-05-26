package org.malitcode.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
		
		public void addFirstBag() {
			btnAddFirstBag.click();
		}
		
		public void addSecondBag() {
			btnAddSecondBag.click();
		}
		
		public void clickViewCart() {
			btnViewCart.click();
		}
		
		
	
	
	

}
