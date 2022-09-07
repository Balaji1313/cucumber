package org.stepdefinition;

import org.base.BaseClass;
import org.junit.Assert;
import org.pages.PageObjectManager;

import io.cucumber.java.en.Then;

public class Common extends BaseClass {
	PageObjectManager pom = new PageObjectManager();
	
	@Then("User should verify after Login {string}")
	public void userShouldVerifyAfterLogin(String string) {

		
		Assert.assertEquals("verify after login", string, getAttribute(pom.getSearchHotelPage().getUsernamemsg()));
		
}
}

