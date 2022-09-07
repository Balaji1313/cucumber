package org.stepdefinition;

import org.junit.Assert;
import org.pages.PageObjectManager;

import io.cucumber.java.en.Then;

public class TC5_CancelBookingStep {
	PageObjectManager pom = new PageObjectManager();
	
	
	@Then("User should navigate to Booked Itinerary page and cancel booking using order id")
	public void userShouldNavigateToBookedItineraryPageAndCancelBookingUsingOrderId() throws InterruptedException {
		
		 String bookingId = pom.getBookingConfirmationPage().getBookingId();
		pom.getCancelBookingPage().bookingCancel(bookingId);
		}
	    
	
	@Then("User should verify the cancel booking success message {string}")
	public void userShouldVerifyTheCancelBookingSuccessMessage(String expcancelledmsg) {
	   
		 
		String actcancelledmsg = pom.getCancelBookingPage().getBookingcancelledmsg().getText();
		Assert.assertEquals("verify a booking cancelled", expcancelledmsg, actcancelledmsg);
		
	}

	
	@Then("User should navigate to Booked itenerary page and cancel booking using existing order id {string}")
	public void userShouldNavigateToBookedIteneraryPageAndCancelBookingUsingExistingOrderId(String orderId) throws InterruptedException {
	    
		pom.getCancelBookingPage().bookingCancel(orderId);
	}

}

	
	
	
