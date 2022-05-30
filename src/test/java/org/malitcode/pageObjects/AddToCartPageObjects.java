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
		
		//Click 1-st product
		@FindBy(xpath ="//*[@id=\"item_4_title_link\"]/div")
		@CacheLookup
		WebElement clickFirstProd;
		
		@FindBy(xpath ="//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]")
		@CacheLookup
		WebElement validateElem;
		
		
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
		
		
		public void validateItem(String item) {
			String item1 = validateElem.getText();
		}
		
	
		
	
	
	

}
