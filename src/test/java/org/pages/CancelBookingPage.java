package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBookingPage extends BaseClass {

	public CancelBookingPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "search_result_error")
	private WebElement bookingcancelledmsg;

	@FindBy(xpath = "(//input[@type='button'])[1]")
	private WebElement cancelbtn;

	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement btnBookedItenarary;

	public WebElement getBookingcancelledmsg() {
		return bookingcancelledmsg;
	}

	public WebElement getCancelbtn() {
		return cancelbtn;
	}

	public WebElement getBtnBookedItenarary() {
		return btnBookedItenarary;
	}

	public void bookingCancel(String orderId) throws InterruptedException {

		Thread.sleep(1000);
		click(getBtnBookedItenarary());
		Thread.sleep(1000);
		click(getCancelbtn());
		Thread.sleep(1000);
		alertclick();

	}

}
