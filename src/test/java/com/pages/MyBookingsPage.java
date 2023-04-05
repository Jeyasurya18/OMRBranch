package com.pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

/**
 * 
 * @author JeyaSurya
 * @Date 22-03-2023
 * @see Used for maitains the locators for myBookingsPage
 *
 */

public class MyBookingsPage extends BaseClass {
	/**
	 * @see Used to call this page in any class with use of object creation
	 */
	public MyBookingsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@data-testid='username']")
	private WebElement btnWelcome;

	@FindBy(xpath = "//a[text()='My Account']")
	private WebElement btnMyAccount;

	@FindBy(id = "step2")
	private WebElement btnMyBooking;

	@FindBy(name = "search")
	private WebElement txtOrderId;

	@FindBy(xpath = "//a[text()='Cancel']")
	private WebElement btnCancel;

	@FindBy(xpath = "//li[text()='Your booking cancelled successfully']")
	private WebElement cancelMsge;

	@FindBy(xpath = "//h5[text()='The Chancery Hotel Deluxe']")
	private WebElement bookedHotel;

	/**
	 * 
	 * @return WebElement
	 * @see Used to get the booked hotel name
	 */
	public WebElement getBookedHotel() {
		return bookedHotel;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to get the booking cancel message
	 */

	public WebElement getCancelMsge() {
		return cancelMsge;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to click the welcomeJeyaText
	 */
	public WebElement getBtnWelcome() {
		return btnWelcome;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to click the myAccountText
	 */

	public WebElement getBtnMyAccount() {
		return btnMyAccount;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to click the myBookingText
	 */
	public WebElement getBtnMyBooking() {
		return btnMyBooking;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to enter the orderId
	 */
	public WebElement getTxtOrderId() {
		return txtOrderId;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to click the cancelButton
	 */
	public WebElement getBtnCancel() {
		return btnCancel;
	}

	// 1Scenario
	/**
	 * 
	 * @param orderId
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws InterruptedException 
	 * @see Used for cancel the orderId
	 */
	public void cancelOrderId() throws FileNotFoundException, IOException, InterruptedException {
		sleep();
		elementClick(getBtnCancel());
		clickOkInAlert();

	}

	/**
	 * @see Used to check navigation
	 */
	public void navigateMyBookingTab() {
		elementClick(getBtnWelcome());
		elementClick(getBtnMyAccount());
		elementClick(getBtnMyBooking());
		elementSendkeys(getTxtOrderId(), BookingConformationPage.BookingId);

	}

	/**
	 * 
	 * @return String
	 * @see Used to get the actual booking cancelled message
	 */
	public String getBookingCancelMsge() {
		String actCancelMsge = getTheText(getCancelMsge());
		System.out.println(actCancelMsge);
		return actCancelMsge;

	}

	/**
	 * 
	 * @return String
	 * @see Used to get the booked hotel name
	 */
	public String bookedHotelPresentOrNot() {
		String hotelName = getTheText(getBookedHotel());
		System.out.println(hotelName);
		return hotelName;

	}

}
