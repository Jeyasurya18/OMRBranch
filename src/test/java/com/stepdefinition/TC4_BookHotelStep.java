package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * 
 * @author JeyaSurya
 * @Date 22-03-2023
 * @see To maintain the methods for book the hotel with enter cardDetails and
 *      upiId
 *
 */
public class TC4_BookHotelStep {
	PageObjectManager pom = new PageObjectManager();

	/**
	 * 
	 * @param salutation
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param mobileNo
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @see used for enter the guestDetails
	 */
	@When("User add guest details {string},{string},{string},{string} and {string}")
	public void user_add_guest_details_and(String salutation, String firstName, String lastName, String mobileNo,
			String email) throws FileNotFoundException, IOException {
		pom.getBookHotelPage().selectHotel();
		pom.getBookHotelPage().addGuestDetails(salutation, firstName, lastName, mobileNo, email);

	}

	/**
	 * 
	 * @param regNo
	 * @param companyName
	 * @param companyAdd
	 * @see Used for enter the gstDetails
	 */
	@When("User add GST details {string},{string} and {string}")
	public void user_add_gst_details_and(String regNo, String companyName, String companyAdd) {
		pom.getBookHotelPage().addGstDetails(regNo, companyName, companyAdd);

	}

	/**
	 * 
	 * @param splReq
	 * @see Used for enter the specialReq
	 */
	@When("User add the {string}")
	public void user_add_the(String splReq) {
		pom.getBookHotelPage().addSpecialRequest(splReq);

	}

	/**
	 * 
	 * @param cardType
	 * @param dataTable
	 * @see Used for enter the cardDetails with the use of dataTable
	 */
	@When("User add payment details,proceed with card type {string}")
	public void user_add_payment_details_proceed_with_card_type(String cardType,
			io.cucumber.datatable.DataTable dataTable) {
		pom.getBookHotelPage().addCardPaymentDetails(cardType, dataTable);

	}

	/**
	 * 
	 * @param expConformationMsge
	 * @see Used to verify the success message for confirmBooking and save the
	 *      orderId
	 */
	@Then("User should verify booking success message after book hotel {string} and save the orderId")
	public void user_should_verify_booking_success_message_after_book_hotel_and_save_the_order_id(
			String expConformationMsge) {
		Assert.assertTrue("Verify booking conformation msge",
				pom.getBookingConformationPage().getBookingConformSuccessMsge().contains(expConformationMsge));

	}

	/**
	 * 
	 * @param upiId
	 * @see Used for enter the upiId
	 */

	@When("User add the UPI detail {string}")
	public void user_add_the_upi_detail(String upiId) {
		pom.getBookHotelPage().addUpiDetails(upiId);

	}

}
