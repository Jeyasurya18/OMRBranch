package com.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

/**
 * 
 * @author JeyaSurya
 * @Date 22-03-2023
 * @see Used for maitains the locators for selectHotelPage
 *
 */

public class SelectHotelPage extends BaseClass {
	/**
	 * @see Used to call this page in any class with use of object creation
	 */
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[text()='Select Hotel']")
	private WebElement selectSuccessMsge;

	@FindBy(xpath = "//a[text()='Deluxe/Suite/Luxury']")
	private WebElement selectRoomType;

	@FindBy(xpath = "(//a[text()='Continue'])[2]")
	private WebElement btnContinue;

	@FindBy(xpath = "//label[text()='Price High to low']")
	private WebElement btnRadioButton;

	@FindBy(xpath = "//div[@class='prize']//child::strong")
	private List<WebElement> prices;

	@FindBy(xpath = "//div[@class='col-md-5 hotel-suites']")
	private List<WebElement> hotelsName;

	/**
	 * 
	 * @return WebElement
	 * @see Used to get the selected room types
	 */
	public WebElement getSelectRoomType() {
		return selectRoomType;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to get the sucsses message(SelectHotel)
	 */

	public WebElement getSelectSuccessMsge() {
		return selectSuccessMsge;
	}

	/**
	 * 
	 * @return List<WebElement>
	 * @see Used to get the allPrices
	 */
	public List<WebElement> getPrices() {
		return prices;
	}

	/**
	 * 
	 * @return List<WebElement> Used to get the allHotelsName
	 */
	public List<WebElement> getHotelsName() {
		return hotelsName;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to click the continueButton
	 */
	public WebElement getBtnContinue() {
		return btnContinue;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to click the radioButtonHighToLow
	 */

	public WebElement getBtnRadioButton() {
		return btnRadioButton;
	}

	/**
	 * @see Used to click the continue button
	 */

	public void clickContinueButton() {
		elementClick(getBtnContinue());

	}

	/**
	 * @see Used for accept the alert
	 */
	public void selectHotelWithAccept() {
		clickOkInAlert();
	}

	/**
	 * @see Used for dismiss the alert
	 */
	public void selectHotelWithDismiss() {
		clickCancelInAlert();
	}

	/**
	 * 
	 * @return boolean
	 * @see Used for check the prices in descending order
	 */
	public boolean sortHotelPriceHighToLow() {
		elementClick(getBtnRadioButton());
		sleep();
		List<String> prices = new ArrayList<String>();
		for (WebElement allPrices : getPrices()) {
			String text = allPrices.getText();
			String hotels = text.replace("$", "").replace(",", "").trim();
			prices.add(hotels);
		}
		List<String>prices1 = new ArrayList<String>();
		prices1.addAll(prices);
		Collections.sort(prices);
		Collections.reverse(prices);
		boolean equals = prices.equals(prices1);
		return equals;

	}// 4Scenario

	/**
	 * 
	 * @param expFilterRooms 
	 * @return List<Boolean>
	 * @see Used for check hotels ends with same name(Deluxe)
	 */
	public boolean hotelNameEndsWithRoomType(String roomType) {
		boolean res = true;
		List<Boolean> hotelsName = new ArrayList<Boolean>();
		for (WebElement eachHotel : getHotelsName()) {
			String hotel = getTheText(eachHotel);
			boolean hotelEndsWith = hotel.endsWith(hotel);
			hotelsName.add(hotelEndsWith);
		}
		if (hotelsName.contains(false)) {
			res = true;
			
		}
		return res;

	}

	/**
	 * 
	 * @return String
	 * @see Used to get the actual success message
	 */

	public String getSelectSuccessMsg() {
		String actSelectSuccessMsge = getTheText(getSelectSuccessMsge());
		return actSelectSuccessMsge;

	}

	/**
	 * 
	 * @return String
	 * @see Used to get the actual selected room types
	 */

	public String getSelectedRoomTypes() {
		String actSelectedRoomTypes = getTheText(getSelectRoomType());
		return actSelectedRoomTypes;

	}

}
