package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmationPage extends BaseClass {

	public BookingConfirmationPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='Booking Confirmation ']")
	private WebElement bookingconfirm;

	@FindBy(id = "order_no")
	private WebElement orderid;

	@FindBy(id = "my_itinerary")
	private WebElement itinerary;

	public WebElement getBookingconfirm() {
		return bookingconfirm;
	}

	public WebElement getItinerary() {
		return itinerary;
	}

	public WebElement getOrderid() {
		return orderid;
	}

	public String getBookingId() {

		String attribute = getAttribute(getOrderid());

		return attribute;

	}
}