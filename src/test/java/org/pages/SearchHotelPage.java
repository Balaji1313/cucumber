package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass {

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username_show")
	private WebElement usernamemsg;

	@FindBy(xpath = "//span[text()='Please Select a Location']")
	private WebElement locationerror;

	@FindBy(xpath = "//span[text()='Check-In Date shall be before than Check-Out Date']")
	private WebElement dateinerror;

	@FindBy(xpath = "//span[text()='Check-Out Date shall be after than Check-In Date']")
	private WebElement dateouterror;

	@FindBy(id = "location")
	private WebElement droplocation;

	@FindBy(id = "hotels")
	private WebElement drophotels;

	@FindBy(id = "room_type")
	private WebElement dropRoomtype;

	@FindBy(id = "room_nos")
	private WebElement dropRoomCount;

	@FindBy(id = "datepick_in")
	private WebElement dropcheckin;

	@FindBy(id = "datepick_out")
	private WebElement dropcheckout;

	@FindBy(id = "adult_room")
	private WebElement dropAdults;

	@FindBy(id = "child_room")
	private WebElement dropChild;

	@FindBy(id = "Submit")
	private WebElement search;

	public WebElement getLocationerror() {
		return locationerror;
	}

	public WebElement getDateinerror() {
		return dateinerror;
	}

	public WebElement getDateouterror() {
		return dateouterror;
	}

	public WebElement getUsernamemsg() {
		return usernamemsg;
	}

	public WebElement getDroplocation() {
		return droplocation;
	}

	public WebElement getDrophotels() {
		return drophotels;
	}

	public WebElement getDropRoomtype() {
		return dropRoomtype;
	}

	public WebElement getDropRoomCount() {
		return dropRoomCount;
	}

	public WebElement getDropcheckin() {
		return dropcheckin;
	}

	public WebElement getDropcheckout() {
		return dropcheckout;
	}

	public WebElement getDropAdults() {
		return dropAdults;
	}

	public WebElement getDropChild() {
		return dropChild;
	}

	public WebElement getSearch() {
		return search;
	}

	public void searchHotel(String location, String hotels, String roomtype, String roomnos, String datein,
			String dateout, String adultperroom, String childperroom) {

		selectByText(getDroplocation(), location);
		selectByText(getDrophotels(), hotels);
		selectByText(getDropRoomtype(), roomtype);
		selectByText(getDropRoomCount(), roomnos);
		clear(getDropcheckin());
		elementSendKeys(getDropcheckin(), datein);
		clear(getDropcheckout());
		elementSendKeys(getDropcheckout(), dateout);
		selectByText(getDropAdults(), adultperroom);
		selectByText(getDropAdults(), childperroom);
		click(getSearch());

	}

	public void searchHotelMandatoryFields(String location, String roomnos, String datein, String dateout,
			String adultperroom) {

		selectByText(getDroplocation(), location);
		selectByText(getDropRoomCount(), roomnos);
		clear(getDropcheckin());
		elementSendKeys(getDropcheckin(), datein);
		clear(getDropcheckout());
		elementSendKeys(getDropcheckout(), dateout);
		selectByText(getDropAdults(), adultperroom);

		click(getSearch());
	}

	public void SearchHotelWithoutAnyFields() {

		click(getSearch());

	}
}
