package org.malitcode.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPageObjects {
	
	WebDriver ldriver;
	   
	//Constructor & Pagefactory
	public AddToCartPageObjects(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	

}
