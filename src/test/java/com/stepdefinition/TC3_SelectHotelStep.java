package com.stepdefinition;

import org.junit.Assert;

import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * 
 * @author JeyaSurya
 * @Date 22-03-2023
 * @see To maintain the methods for select the hotel
 *
 */
public class TC3_SelectHotelStep {
	PageObjectManager pom = new PageObjectManager();

	/**
	 * @see Used for select the hotel with the use of click continueButton
	 */
	@When("User select the hotel")
	public void user_select_the_hotel() {
		pom.getSelectHotelPage().clickContinueButton();

	}

	/**
	 * @see Used for accept the alert
	 */
	@When("User accept the alert")
	public void user_accept_the_alert() {
		pom.getSelectHotelPage().selectHotelWithAccept();

	}

	/**
	 * @see Used for accept the alert
	 */
	@When("User dismiss the alert")
	public void user_dismiss_the_alert() {
		pom.getSelectHotelPage().selectHotelWithDismiss();

	}

	/**
	 * @see Used for click the radioButtonHighToLow
	 */
	@When("User click the radio button on price high to low")
	public void user_click_the_radio_button_on_price_high_to_low() {
		pom.getSelectHotelPage().getBtnRadioButton();

	}

	/**
	 * @see Used to verify the hotels displayed in descending order after click
	 *      radioButton
	 */
	@Then("User should verify the hotels displayed high to low price after click the radio button")
	public void user_should_verify_the_hotels_displayed_high_to_low_price_after_click_the_radio_button() {
		Assert.assertTrue("Verify hotels displayed high to low price", pom.getSelectHotelPage().sortHotelPriceHighToLow());

	}

	/**
	 * 
	 * @param expFilterRooms
	 * @see Used to verify the Filterd roomTypes present or not
	 */

	@Then("User should verify room type filter ends with {string}")
	public void user_should_verify_room_type_filter_ends_with(String roomType) {	
    Assert.assertTrue("Verify room type filter ends with", pom.getSelectHotelPage().hotelNameEndsWithRoomType(roomType));

	}

}
