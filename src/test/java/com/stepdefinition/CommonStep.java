package com.stepdefinition;

import org.junit.Assert;

import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

public class CommonStep {
	/**
	 * @author JeyaSurya
	 * @Date 24-03-2023
	 * @See Use to maintains the common steps for OMR Branch hotel automation
	 */
	PageObjectManager pom = new PageObjectManager();

	/**
	 * 
	 * @param expSuccessMsge
	 * @see Used to verify the success message after passing valid datas
	 */

	@Then("User should verify success message after login {string}")
	public void user_should_verify_success_message_after_login(String expLoginSuccessMsge) {
		Assert.assertEquals("Verify after login success message", expLoginSuccessMsge,
				pom.getExploreHotelsPage().getLoginSuccessMsge());

	}

	/**
	 * 
	 * @param expSuccessSelectMsge
	 * @see Used to verify the success message after enter all datas
	 */
	@Then("User should verify the success message after search hotel {string}")
	public void user_should_verify_the_success_message_after_search_hotel(String expSuccessSelectMsge) {
		Assert.assertEquals("Verify select hotel success message after search hotel", expSuccessSelectMsge,
				pom.getSelectHotelPage().getSelectSuccessMsg());

	}

	/**
	 * 
	 * @param expFilterRooms
	 * @see Used to check the filter roomType message after search the hotel
	 */

	@Then("User should verify the filter room types message after search hotel {string}")
	public void user_should_verify_the_filter_room_types_message_after_search_hotel(String expFilterRooms) {
		Assert.assertEquals("Verify selected room types after search hotel", expFilterRooms,
				pom.getSelectHotelPage().getSelectedRoomTypes());

	}

	/**
	 * 
	 * @param expSelectHotel
	 * @see Used to check the success message for selected hotel
	 */
	@Then("User should verify the success message after accept the alert message {string} and save the hotel name")
	public void user_should_verify_the_success_message_after_accept_the_alert_message_and_save_the_hotel_name(
			String expBookHotel) {
		Assert.assertTrue("Verify book hotel success message",
				pom.getBookHotelPage().getSuccessMsgeBookHotel().contains(expBookHotel));

	}

}
