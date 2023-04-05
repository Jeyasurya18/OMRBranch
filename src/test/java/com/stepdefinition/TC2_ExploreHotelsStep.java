package com.stepdefinition;

import org.junit.Assert;

import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * 
 * @author JeyaSurya
 * @Date 22-03-2023
 * @see To maintain the methods for search the hotel with enter allDatas and
 *      mandatoryDatas
 *
 */
public class TC2_ExploreHotelsStep {
	PageObjectManager pom = new PageObjectManager();

	/**
	 * 
	 * @param state
	 * @param city
	 * @param roomType
	 * @param checkIn
	 * @param CheckOut
	 * @param noOfRooms
	 * @param noOfAdults
	 * @param noOfChildrens
	 * @throws InterruptedException
	 * @see Used for search the hotel with enter all datas
	 */

	@When("User search the {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_search_the_and(String state, String city, String roomType, String checkIn, String CheckOut,
			String noOfRooms, String noOfAdults, String noOfChildrens) throws InterruptedException {
		pom.getExploreHotelsPage().exploreHotels(state, city, roomType, checkIn, CheckOut, noOfRooms, noOfAdults,
				noOfChildrens);

	}

	/**
	 * 
	 * @param state
	 * @param city
	 * @param checkIn
	 * @param CheckOut
	 * @param noOfRooms
	 * @param noOfAdults
	 * @see Used for search the hotel with enter mandatory datas
	 */

	@When("User search the {string},{string},{string},{string},{string} and {string}")
	public void user_search_the_and(String state, String city, String checkIn, String CheckOut, String noOfRooms,
			String noOfAdults) {
		pom.getExploreHotelsPage().exploreHotelsmand(state, city, checkIn, CheckOut, noOfRooms, noOfAdults);

	}

	/**
	 * @see Used to click the search after enter datas
	 */

	@Then("User click search button")
	public void user_click_search_button() {
		pom.getExploreHotelsPage().clickSearchHotel();

	}

	/**
	 * 
	 * @param expErrorMsge1
	 * @param expErrorMsge2
	 * @param expErrorMsge3
	 * @param expErrorMsge4
	 * @param expErrorMsge5
	 * @param expErrorMsge6
	 * @throws InterruptedException
	 * @see Use for verify 6 error messages after click search button without enter
	 *      any data's
	 */
	@Then("User should verify error messages after click search without enter any field {string},{string},{string},{string},{string} and {string}")
	public void user_should_verify_error_messages_after_click_search_without_enter_any_field_and(
			String expStateErrorMsge, String expCityErrorMsge, String expCheckInErrorMsge, String expCheckOutErrorMsge,
			String expNoOfRoomsErrorMsge, String expNoOfAdultsErrorMsge) throws InterruptedException {
		Assert.assertEquals("Verify state error message", expStateErrorMsge,
				pom.getExploreHotelsPage().getInvalidStateErrorMsg());
		Assert.assertEquals("Verify city error message", expCityErrorMsge,
				pom.getExploreHotelsPage().getInvalidCityErrorMsg());
		Assert.assertEquals("Verify checkin date error message", expCheckInErrorMsge,
				pom.getExploreHotelsPage().getInvalidCheckInErrorMsg());
		Assert.assertEquals("Verify checkout date error message", expCheckOutErrorMsge,
				pom.getExploreHotelsPage().getInvalidCheckOutErrorMsg());
		Assert.assertEquals("Verify no of rooms error message", expNoOfRoomsErrorMsge,
				pom.getExploreHotelsPage().getInvalidNoOfRoomsErrorMsg());
		Assert.assertEquals("Verify no of adults error message", expNoOfAdultsErrorMsge,
				pom.getExploreHotelsPage().getInvalidStateNoOfAdultsMsg());

	}

}
