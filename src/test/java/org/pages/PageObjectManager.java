package org.pages;

public class PageObjectManager {
	
	private LoginPage loginPage;
	private SearchHotelPage searchHotelPage;
	private SelectHotelPage selectHotelPage;
	private BookHotelPage bookHotelpage;
	private BookingConfirmationPage bookingConfirmationPage;
	private  CancelBookingPage cancelBookingPage;
	
	
	
	public LoginPage getLoginPage() {
		return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
	}
	public SearchHotelPage getSearchHotelPage() {
		return (searchHotelPage == null) ? searchHotelPage = new SearchHotelPage() : searchHotelPage;
	}
	public SelectHotelPage getSelectHotelPage() {
		return (selectHotelPage == null) ? selectHotelPage = new SelectHotelPage() : selectHotelPage;
	}
	public BookHotelPage getBookHotelpage() {
		return (bookHotelpage == null) ? bookHotelpage = new BookHotelPage() : bookHotelpage;
	}
	public BookingConfirmationPage getBookingConfirmationPage() {
		return (bookingConfirmationPage == null) ? bookingConfirmationPage = new BookingConfirmationPage() : bookingConfirmationPage;
	}
	public CancelBookingPage getCancelBookingPage() {
		return (cancelBookingPage == null) ? cancelBookingPage = new CancelBookingPage() : cancelBookingPage;
	}
	
	
	
	
	
	
	
	

}
