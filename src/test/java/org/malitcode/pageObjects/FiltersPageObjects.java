package org.malitcode.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FiltersPageObjects {
	WebDriver ldriver;
	   
	//Constructor & Pagefactory
	public FiltersPageObjects(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// Elements or ID's, select option 3
	@FindBy(xpath ="//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[3]")
	@CacheLookup
	WebElement dropDownLowToHigh;
	
	
	
	public void selectDropDown() {
		dropDownLowToHigh.click();
	}

}
