package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


/**
 * 
 * @author JeyaSurya
 * @Date 22-03-2023
 * @see To maintains the methods for cancel the booking
 *
 */
public class TC5_MyBookingsStep extends BaseClass {
	PageObjectManager pom = new PageObjectManager();

	/**
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @see Used to check the navigation into myBookingTab
	 */
	@When("User navigate into the mybooking tab")
	public void user_navigate_into_the_mybooking_tab() throws FileNotFoundException, IOException {
		pom.getBookingConformationPage().getOrderId();
		pom.getMyBookingsPage().navigateMyBookingTab();

	}

	/**
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @see Used to verify the booked hotel is present or not
	 */
	@Then("User should verify booked hotel is present or not")
	public void user_should_verify_booked_hotel_is_present_or_not() throws FileNotFoundException, IOException {
		Assert.assertEquals("Verify booked hotel is present or not", getPropertyFileValue("SelectHotelName"),pom.getMyBookingsPage().bookedHotelPresentOrNot());
		
	}

	/**
	 * @param orderId
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws InterruptedException 
	 * @see Used for cancel the orderId
	 */
	@When("User cancel the orderId")
	public void user_cancel_the_order_id() throws FileNotFoundException, IOException, InterruptedException {
		pom.getMyBookingsPage().cancelOrderId();

	}

	/**
	 * 
	 * @param expBookingCancelMsge
	 * @see Used to verify the success message for cancellation after cancel the
	 *      booking
	 */
	@Then("User should verify the success message after cancel orderId {string}")
	public void user_should_verify_the_success_message_after_cancel_order_id(String expBookingCancelMsge) {
		Assert.assertEquals("Verify cancel booking message", expBookingCancelMsge,
				pom.getMyBookingsPage().getBookingCancelMsge());

	}

}
