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
 * @see Used for maitains the locators for bookinConformationPage
 *
 */

public class BookingConformationPage extends BaseClass {
	/**
	 * @see Used to call this page in any class with use of object creation
	 */

	public BookingConformationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[@name='booking-code']//strong")
	private WebElement getOrderId;

	@FindBy(xpath = "//h2[@name='booking-code']")
	private WebElement bookingConformMsge;

	/**
	 * 
	 * @return WebElement
	 * @see Used to get booking conform message
	 */
	public WebElement getBookingConformMsge() {
		return bookingConformMsge;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to get the orderId
	 */
	public WebElement getGetOrderId() {
		return getOrderId;
	}

	/**
	 * @see Used for getting orderId
	 * @return String
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static String BookingId;
	public String getOrderId() throws FileNotFoundException, IOException {
		String orderId = getGetOrderId().getText(); 
		String orderId1 = orderId.replace("#", "");
		BookingId=orderId1;
		return orderId1;
	}

	/**
	 * 
	 * @return String
	 * @see Used to get the actual booking conformation message
	 */

	public String getBookingConformSuccessMsge() {
		String actBookingConformSuccessMsge = getTheText(getBookingConformMsge());
		return actBookingConformSuccessMsge;

	}
}
