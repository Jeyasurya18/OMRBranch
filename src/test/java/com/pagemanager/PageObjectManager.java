package com.pagemanager;

import com.pages.BookHotelPage;
import com.pages.BookingConformationPage;
import com.pages.ExploreHotelsPage;
import com.pages.LoginPage;
import com.pages.MyBookingsPage;
import com.pages.SelectHotelPage;

/**
 * 
 * @author JEYASURYA
 * @see Used to maintain all pages objects
 */
public class PageObjectManager {

	private LoginPage loginPage;
	private ExploreHotelsPage exploreHotelsPage;
	private SelectHotelPage selectHotelPage;
	private BookHotelPage bookHotelPage;
	private BookingConformationPage bookingConformationPage;
	private MyBookingsPage myBookingsPage;

	/**
	 * 
	 * @return LoginPage
	 * @see If object is not create,create the objects&return, and If object is
	 *      created,return the created object
	 */
	public LoginPage getLoginPage() {
		return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
	}

	/**
	 * 
	 * @return ExploreHotelsPage
	 * @see If object is not create,create the objects&return and If object is
	 *      created,return the created object
	 */
	public ExploreHotelsPage getExploreHotelsPage() {
		return (exploreHotelsPage == null) ? exploreHotelsPage = new ExploreHotelsPage() : exploreHotelsPage;
	}

	/**
	 * 
	 * @return SelectHotelPage
	 * @see If object is not create,create the objects&return and If object is
	 *      created,return the created object
	 */
	public SelectHotelPage getSelectHotelPage() {
		return (selectHotelPage == null) ? selectHotelPage = new SelectHotelPage() : selectHotelPage;
	}

	/**
	 * 
	 * @return BookHotelPage
	 * @see If object is not create,create the objects&return and If object is
	 *      created,return the created object
	 */
	public BookHotelPage getBookHotelPage() {
		return (bookHotelPage == null) ? bookHotelPage = new BookHotelPage() : bookHotelPage;
	}

	/**
	 * 
	 * @return BookingConformationPage
	 * @see If object is not create,create the objects&return and If object is
	 *      created,return the created object
	 */
	public BookingConformationPage getBookingConformationPage() {
		return (bookingConformationPage == null) ? bookingConformationPage = new BookingConformationPage()
				: bookingConformationPage;
	}

	/**
	 * 
	 * @return MyBookingsPage
	 * @see If object is not create,create the objects&return and If object is
	 *      created,return the created object
	 */
	public MyBookingsPage getMyBookingsPage() {
		return (myBookingsPage == null) ? myBookingsPage = new MyBookingsPage() : myBookingsPage;
	}

}
