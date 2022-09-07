package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.pages.PageObjectManager;

import io.cucumber.java.en.Then;

public class TC4_BookHotelStep {

	PageObjectManager pom = new PageObjectManager();

	@Then("User should enter book hotel credentials {string},{string} and {string}")
	public void userShouldEnterBookHotelCredentialsAnd(String firstname, String lastname, String address,
			io.cucumber.datatable.DataTable dataTable) {

		List<Map<String, String>> cards = dataTable.asMaps();

		Map<String, String> card = cards.get(0);
		String cardType = card.get("cardType");
		String cardNo = card.get("cardNo");
		String expMonth = card.get("expMonth");
		String expYear = card.get("expYear");
		String cardCvv = card.get("cardCvv");

		pom.getBookHotelpage().bookHotel(firstname, lastname, address, cardNo, cardType, expMonth, expYear, cardCvv);

	}

	@Then("User should navigate to booking confirmation page and verify message {string}")
	public void userShouldNavigateToBookingConfirmationPageAndVerifyMessage(String expbookingsuccessmsg)
			throws InterruptedException {

		Thread.sleep(7000);
		String actbookingsuccessmsg = pom.getBookingConfirmationPage().getBookingconfirm().getText();
		Assert.assertEquals("verify a booking msg", expbookingsuccessmsg, actbookingsuccessmsg);
	}

	@Then("User should click book now without entering any fields")
	public void userShouldClickBookNowWithoutEnteringAnyFields() {

		pom.getBookHotelpage().bookHotelWithoutAnyFields();

	}

	@Then("User should verify error messages of all fields {string}, {string}, {string}, {string}, {string}, {string} and {string}")
	public void userShouldVerifyErrorMessagesOfAllFieldsAnd(String expfnameerrormsg, String expLnameerrormsg,
			String expaddresserrormsg, String expccnumerrormsg, String expcctypeerrormsg, String expccexperrormsg,
			String expccccverrormsg) {

		String actfnameerrormsg = pom.getBookHotelpage().getFnameerrormsg().getText();
		Assert.assertEquals("verify Fname error msg", expfnameerrormsg, actfnameerrormsg);

		String actLnameerrormsg = pom.getBookHotelpage().getLnameerrormsg().getText();
		Assert.assertEquals("verify Lname error msg ", expLnameerrormsg, actLnameerrormsg);

		String actaddresserrormsg = pom.getBookHotelpage().getAddrresserrormsg().getText();
		Assert.assertEquals("verify address error msg", expaddresserrormsg, actaddresserrormsg);

		String actccnumerrormsg = pom.getBookHotelpage().getCcnoerrormsg().getText();
		Assert.assertEquals("verify ccvnum error msg", expccnumerrormsg, actccnumerrormsg);

		String actcctypeerrormsg = pom.getBookHotelpage().getCctypeerrormsg().getText();
		Assert.assertEquals("verify cctype error msg", expcctypeerrormsg, actcctypeerrormsg);

		String actccexperrormsg = pom.getBookHotelpage().getCcexperrormsg().getText();
		Assert.assertEquals("verify ccexp error msg", expccexperrormsg, actccexperrormsg);

		String actccccverrormsg = pom.getBookHotelpage().getCcccverrormsg().getText();
		Assert.assertEquals("verify cctype error msg", expccccverrormsg, actccccverrormsg);

	}

}
