package org.stepdefinition;

import org.junit.Assert;
import org.pages.PageObjectManager;


import io.cucumber.java.en.Then;


public class TC3_SelectHotelStep {

	PageObjectManager pom = new PageObjectManager();

	@Then("User should select hotel name and click continue")
	public void userShouldSelectHotelNameAndClickContinue() {
		
		pom.getSelectHotelPage().selectWithHotelName();
		
	    
	}
	@Then("User should navigate to book hotel page and verify message {string}")
	public void userShouldNavigateToBookHotelPageAndVerifyMessage(String booksuccess) {
	 
		String booksuccessmsg = pom.getBookHotelpage().getBookhotelsuccess().getText();
		Assert.assertEquals("textbooksuccessmsg", booksuccess, booksuccessmsg);;
		
		
	}

	@Then("User should click continue without selecting hotel name")
	public void userShouldClickContinueWithoutSelectingHotelName() {
		
		
		pom.getSelectHotelPage().selectWithoutHotelName();
	  
	}
	
	@Then("User should verify error message without selecting hotel name {string}")
	public void userShouldVerifyErrorMessage(String pleaseSelectHotel) {
		
		String pleaseSelectHotelmsg = pom.getSelectHotelPage().getPlsselecthotelmsg().getText();
		Assert.assertEquals("pleaseSelectHotel", pleaseSelectHotel, pleaseSelectHotelmsg);
		
	}
	 
	
	

}
		
