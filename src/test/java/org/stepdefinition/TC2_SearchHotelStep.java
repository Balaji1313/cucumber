package org.stepdefinition;

import org.junit.Assert;
import org.pages.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_SearchHotelStep {

	PageObjectManager pom = new PageObjectManager();

	@When("User should perform by search hotel details {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userShouldPerformBySearchHotelDetailsAnd(String location, String hotels, String roomtype,
			String roomnos, String datein, String dateout, String adultperroom, String childperroom) {

		pom.getSearchHotelPage().searchHotel(location, hotels, roomtype, roomnos, datein, dateout, adultperroom,
				childperroom);

	}

	@Then("User should navigate to select hotel and verify success message {string}")
	public void userShouldNavigateToSelectHotelAndVerifySuccessMessage(String selecthotel) {
		String selecthotelmsg = pom.getSelectHotelPage().getSelecthotelmsg().getText();
		Assert.assertEquals("selecthotelmsg", selecthotel, selecthotelmsg);

	}

	@When("User should enter only mandatory fields {string},{string},{string},{string} and {string}")
	public void userShouldEnterOnlyMandatoryFieldsAnd(String location, String roomnos, String datein, String dateout,
			String adultperroom) {

		pom.getSearchHotelPage().searchHotelMandatoryFields(location, roomnos, datein, dateout, adultperroom);

	}

	@Then("User should verify error message {string} and {string}")
	public void userShouldVerifyErrorMessageAnd(String checkinbefore, String checkinafter) {
		String dateinmsg = pom.getSearchHotelPage().getDateinerror().getText();
		Assert.assertEquals("dateinmsg", checkinbefore, dateinmsg);

		String dateoutmsg = pom.getSearchHotelPage().getDateouterror().getText();
		Assert.assertEquals("dateoutmsg", checkinafter, dateoutmsg);

	}

	@When("User should click search button without selecting any fields")
	public void userShouldClickSearchButtonWithoutSelectingAnyFields() {

		pom.getSearchHotelPage().SearchHotelWithoutAnyFields();

	}

	@Then("User should verify wihout entering any fields error message {string}")
	public void userShouldVerifyWihoutEnteringAnyFieldsErrorMessage(String locationerror) {

		String locationmsg = pom.getSearchHotelPage().getLocationerror().getText();
		Assert.assertEquals("locationerrormsg", locationerror, locationmsg);
	}

}
