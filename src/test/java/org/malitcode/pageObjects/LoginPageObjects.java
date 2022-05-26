package org.malitcode.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
   
	
	WebDriver ldriver;
   
	//Constructor & Pagefactory
	public LoginPageObjects(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// Elements or ID's
	@FindBy(xpath ="//*[@id=\"user-name\"]")
	@CacheLookup
	WebElement txtName;
	
	@FindBy(id ="password")
	@CacheLookup
	WebElement txtPassword;
	
	
	@FindBy(xpath ="//*[@id=\"login-button\"]")
	@CacheLookup
	WebElement btnLogin;
	
	
	//methods
	public void setUsername(String userName) {
		txtName.sendKeys(userName);
	}
	
	public void setPassWord(String userPass) {
		txtPassword.sendKeys(userPass);
	}
	
	public void clickLoginBtn() {
		btnLogin.click();
	}

}
