package org.malitcode.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SideBarObjects {

	WebDriver ldriver;
	
	// Constructor & Page-factory
	public SideBarObjects(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//*[@id=\"react-burger-menu-btn\"]")
	@CacheLookup
	WebElement sideBarBtn;
	
	@FindBy(xpath = "//*[@id=\"logout_sidebar_link\"]")
	@CacheLookup
	WebElement btnLogout;
	
	
	@FindBy(xpath="//*[@id=\"about_sidebar_link\"]")
	@CacheLookup
	WebElement btnAbout;
	
	//Methods
	public void clickSideBar() {
		sideBarBtn.click();
	}
	
	public void clickLogout() {
		btnLogout.click();
	}
	
	public void clickAboutBtn() {
		btnAbout.click();
	}
	
	public void validatePageTitle(String queryTitle) {
		if(ldriver.getTitle().equals(queryTitle)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	

}
