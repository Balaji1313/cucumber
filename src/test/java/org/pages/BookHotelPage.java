package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends BaseClass {

	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name_span")
	private WebElement fnameerrormsg;

	@FindBy(id = "last_name_span")
	private WebElement lnameerrormsg;

	@FindBy(id = "address_span")
	private WebElement addrresserrormsg;

	@FindBy(id = "cc_num_span")
	private WebElement ccnoerrormsg;

	@FindBy(id = "cc_type_span")
	private WebElement cctypeerrormsg;

	@FindBy(id = "cc_expiry_span")
	private WebElement ccexperrormsg;

	@FindBy(id = "cc_cvv_span")
	private WebElement ccccverrormsg;

	@FindBy(xpath = "//td[text()='Book A Hotel ']")
	private WebElement bookhotelsuccess;

	@FindBy(name = "first_name")
	private WebElement fname;

	@FindBy(name = "last_name")
	private WebElement lname;

	@FindBy(name = "address")
	private WebElement address;

	@FindBy(name = "cc_num")
	private WebElement card;

	@FindBy(name = "cc_type")
	private WebElement cardtype;

	@FindBy(name = "cc_exp_month")
	private WebElement expmonth;

	@FindBy(name = "cc_exp_year")
	private WebElement expyear;

	@FindBy(name = "cc_cvv")
	private WebElement ccvno;

	@FindBy(name = "book_now")
	private WebElement btnbook;

	public WebElement getFnameerrormsg() {
		return fnameerrormsg;
	}

	public WebElement getLnameerrormsg() {
		return lnameerrormsg;
	}

	public WebElement getAddrresserrormsg() {
		return addrresserrormsg;
	}

	public WebElement getCcnoerrormsg() {
		return ccnoerrormsg;
	}

	public WebElement getCctypeerrormsg() {
		return cctypeerrormsg;
	}

	public WebElement getCcexperrormsg() {
		return ccexperrormsg;
	}

	public WebElement getCcccverrormsg() {
		return ccccverrormsg;
	}

	public WebElement getBookhotelsuccess() {
		return bookhotelsuccess;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCard() {
		return card;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCcvno() {
		return ccvno;
	}

	public WebElement getBtnbook() {
		return btnbook;
	}

	public void bookHotel(String fname, String lname, String address, String cardno, String cardtype, String expmonth,
			String expyear, String ccvno) {

		elementSendKeys(getFname(), fname);
		elementSendKeys(getLname(), lname);
		elementSendKeys(getAddress(), address);
		elementSendKeys(getCard(), cardno);
		selectByText(getCardtype(), cardtype);
		selectByText(getExpmonth(), expmonth);
		selectByText(getExpyear(), expyear);
		elementSendKeys(getCcvno(), ccvno);
		click(getBtnbook());

	}

	public void bookHotelWithoutAnyFields() {

		click(getBtnbook());

	}

}
