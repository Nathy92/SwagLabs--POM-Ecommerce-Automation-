package org.malitcode.testCases;

import org.malitcode.pageObjects.FiltersPageObjects;
import org.malitcode.pageObjects.LoginPageObjects;

public class Filters extends BaseClass{
	
	public void filster() {
		FiltersPageObjects filterPageObj =  new FiltersPageObjects(driver);
		LoginPageObjects loginPage = new LoginPageObjects(driver);
	}

}
