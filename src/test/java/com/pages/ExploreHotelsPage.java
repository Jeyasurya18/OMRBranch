package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

/**
 * 
 * @author JeyaSurya
 * @Date 22-03-2023
 * @see Used for maitains the locators for exploreHotelPage
 *
 */

public class ExploreHotelsPage extends BaseClass {
	/**
	 * @see Used to call this page in any class with use of object creation
	 */

	public ExploreHotelsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "state")
	private WebElement ddnState;

	@FindBy(xpath = "//span[text()='Select City *']")
	private WebElement btnCityName;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	private WebElement txtCityName;

	@FindBy(xpath = "//textarea[contains(@class,'select2-search__field')]")
	private WebElement txtRoomType;

	@FindBy(name = "check_in")
	private WebElement txtCheckin;

	@FindBy(name = "check_out")
	private WebElement txtCheckout;

	@FindBy(id = "no_rooms")
	private WebElement ddnNoofRooms;

	@FindBy(id = "no_adults")
	private WebElement ddnNoofAdults;

	@FindBy(id = "no_child")
	private WebElement txtNoofChild;

	@FindBy(id = "searchBtn")
	private WebElement btnSearch;

	@FindBy(xpath = "//a[contains(text(),'Welcome')]")
	private WebElement getTxtLoginSuccessMsg;

	@FindBy(xpath = "//div[text()='Please select state']")
	private WebElement invalidStateErrorMsge;

	@FindBy(xpath = "//div[text()='Please select city']")
	private WebElement invalidCityErrorMsge;

	@FindBy(xpath = "//div[text()='Please select Check-in date']")
	private WebElement invalidCheckInErrorMsge;

	@FindBy(xpath = "//div[text()='Please select Check-out date']")
	private WebElement invalidCheckOutErrorMsge;

	@FindBy(xpath = "//div[text()='Please select no. of rooms']")
	private WebElement invalidNoOfRoomsErrorMsge;

	@FindBy(xpath = "//div[text()='Please select no. of adults']")
	private WebElement invalidNoOfAdultsErrorMsge;

	@FindBy(xpath = "//li[contains(@class,'results__option--highlighted')]")
	private WebElement optionsClick;

	/**
	 * 
	 * @return WebElement
	 * @see Used to click options of room type
	 */
	public WebElement getOptionsClick() {
		return optionsClick;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to select the state
	 */

	public WebElement getDdnState() {
		return ddnState;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to click the city
	 */

	public WebElement getBtnCityName() {
		return btnCityName;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to enter the cityName
	 */
	public WebElement getTxtCityName() {
		return txtCityName;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to enter the roomType
	 */

	public WebElement getTxtRoomType() {
		return txtRoomType;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to enter the checkinDate
	 */

	public WebElement getTxtCheckin() {
		return txtCheckin;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to enter the checkOutDate
	 */

	public WebElement getTxtCheckout() {
		return txtCheckout;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to select the noOfRooms
	 */

	public WebElement getDdnNoofRooms() {
		return ddnNoofRooms;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to select the noOfAdults
	 */

	public WebElement getDdnNoofAdults() {
		return ddnNoofAdults;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to enter the noOfChild
	 */

	public WebElement getTxtNoofChild() {
		return txtNoofChild;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to click the searchButton
	 */

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to get the login success message
	 */

	public WebElement getGetTxtLoginSuccessMsg() {
		return getTxtLoginSuccessMsg;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to get the error message of state selection
	 */

	public WebElement getInvalidStateErrorMsge() {
		return invalidStateErrorMsge;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to get the error message of city selection
	 */

	public WebElement getInvalidCityErrorMsge() {
		return invalidCityErrorMsge;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to get the error message of check in date selection
	 */

	public WebElement getInvalidCheckInErrorMsge() {
		return invalidCheckInErrorMsge;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to get the error message of check out date selection
	 */

	public WebElement getInvalidCheckOutErrorMsge() {
		return invalidCheckOutErrorMsge;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to get the error message of rooms selection
	 */

	public WebElement getInvalidNoOfRoomsErrorMsge() {
		return invalidNoOfRoomsErrorMsge;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to get the error message of adults selection
	 */

	public WebElement getInvalidNoOfAdultsErrorMsge() {
		return invalidNoOfAdultsErrorMsge;
	}

	/**
	 * 
	 * @param state
	 * @param city
	 * @param checkin
	 * @param checkout
	 * @param noRooms
	 * @param noAdults
	 * @see Used to maintains common step for exploreHotelPage
	 */
	public void exploreHotelCommonStep(String state, String city, String checkIn, String checkOut, String noOfRooms,
			String noOfAdults) {
		selectOptionByText(getDdnState(), state);
		elementClick(getBtnCityName());
		elementSendkeysEnter(getTxtCityName(), city);
		elementSendkeysJs(getTxtCheckin(), checkIn);
		elementSendkeysJs(getTxtCheckout(), checkOut);
		selectOptionByText(getDdnNoofRooms(), noOfRooms);
		selectOptionByText(getDdnNoofAdults(), noOfAdults);
	}

	/**
	 * @see Used for click the search button
	 */
	public void clickSearchHotel() {
		switchToFrameDefaultcontent();
		switchToFrameByIndex(0);
		elementClick(getBtnSearch());

	}

	/**
	 * 
	 * @param element
	 * @param data
	 * @throws InterruptedException
	 * @see Used to pass multiple datas using split method
	 */
	public void sendKeysUsingSplit(WebElement element, String data) throws InterruptedException {
		String[] dataArray = data.split("/");
		for (int i = 0; i < dataArray.length; i++) {
			element.sendKeys(dataArray[i]);
			optionsClick.click();

		}

	}

	/**
	 * 
	 * @param state
	 * @param city
	 * @param roomType
	 * @param checkin
	 * @param checkout
	 * @param norooms
	 * @param noadults
	 * @param noOfChild
	 * @see User for enter all datas in exploreHotelPage
	 */
	public void exploreHotels(String state, String city, String roomType, String checkIn, String checkOut,
			String noOfRooms, String noOfAdults, String noOfChildrens) throws InterruptedException {
		exploreHotelCommonStep(state, city, checkIn, checkOut, noOfRooms, noOfAdults);
		sendKeysUsingSplit(getTxtRoomType(), roomType);
		elementSendkeys(getTxtNoofChild(), noOfChildrens);
		clickSearchHotel();
	}// 2Scenario

	/**
	 * 
	 * @param state
	 * @param city
	 * @param checkin
	 * @param checkout
	 * @param noRooms
	 * @param noAdults
	 * @see Used for enter mandatory datas in exploreHotelsPage
	 */
	public void exploreHotelsmand(String state, String city, String checkIn, String checkOut, String noOfRooms,
			String noOfAdults) {
		exploreHotelCommonStep(state, city, checkIn, checkOut, noOfRooms, noOfAdults);
		clickSearchHotel();
	}

	/**
	 * 
	 * @return String
	 * @see Used to get the actual login success message
	 */

	public String getLoginSuccessMsge() {
		String actLoginSuccessMsg = getTheText(getGetTxtLoginSuccessMsg());
		return actLoginSuccessMsg;

	}

	/**
	 * 
	 * @return String
	 * @see Used to get the actual error success message of state selection
	 */

	public String getInvalidStateErrorMsg() {
		switchToFrameDefaultcontent();
		String actInvalidStateErrorMsge = getTheText(getInvalidStateErrorMsge());
		return actInvalidStateErrorMsge;

	}

	/**
	 * 
	 * @return String
	 * @see Used to get the actual error success message of city selection
	 */

	public String getInvalidCityErrorMsg() {
		String actInvalidCityErrorMsge = getTheText(getInvalidCityErrorMsge());
		return actInvalidCityErrorMsge;

	}

	/**
	 * 
	 * @return String
	 * @see Used to get the actual error success message of check in date selection
	 */

	public String getInvalidCheckInErrorMsg() {
		String actInvalidCheckInErrorMsge = getTheText(getInvalidCheckInErrorMsge());
		return actInvalidCheckInErrorMsge;

	}

	/**
	 * 
	 * @return String
	 * @see Used to get the actual error success message of check out date selection
	 */

	public String getInvalidCheckOutErrorMsg() {
		String actInvalidCheckOutErrorMsge = getTheText(getInvalidCheckOutErrorMsge());
		return actInvalidCheckOutErrorMsge;

	}

	/**
	 * 
	 * @return String
	 * @see Used to get the actual error success message of rooms selection
	 */

	public String getInvalidNoOfRoomsErrorMsg() {
		String actInvalidNoOfRoomsErrorMsge = getTheText(getInvalidNoOfRoomsErrorMsge());
		return actInvalidNoOfRoomsErrorMsge;

	}

	/**
	 * 
	 * @return String
	 * @see Used to get the actual error success message of adults selection
	 */

	public String getInvalidStateNoOfAdultsMsg() {
		String actInvalidNoOfAdultsErrorMsge = getTheText(getInvalidNoOfAdultsErrorMsge());
		return actInvalidNoOfAdultsErrorMsge;

	}

}
