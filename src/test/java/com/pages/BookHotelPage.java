package com.pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

import io.cucumber.datatable.DataTable;

/**
 * 
 * @author JeyaSurya
 * @Date 22-03-2023
 * @see Used for maitains the locators for bookHotelPage
 *
 */

public class BookHotelPage extends BaseClass {
	/**
	 * @see Used to call this page in any class with use of object creation
	 */
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[@class='px-3 py-2']")
	private WebElement bookHotelSuccessMsge;

	@FindBy(xpath = "//input[@id='own']")
	private WebElement btnMyself;

	@FindBy(id = "user_title")
	private WebElement ddnSalutation;

	@FindBy(id = "first_name")
	private WebElement txtFirstName;

	@FindBy(id = "last_name")
	private WebElement txtLastName;

	@FindBy(id = "user_phone")
	private WebElement txtMobileNo;

	@FindBy(id = "user_email")
	private WebElement txtEmail;

	@FindBy(id = "gst")
	private WebElement btnGst;

	@FindBy(id = "gst_registration")
	private WebElement txtRegNo;

	@FindBy(id = "company_name")
	private WebElement txtCompName;

	@FindBy(id = "company_address")
	private WebElement txtCompAdd;

	@FindBy(id = "step1next")
	private WebElement btnNext;

	@FindBy(id = "smoking")
	private WebElement btnSmokingRoom;

	@FindBy(id = "late")
	private WebElement btnLateCheckin;

	@FindBy(name = "other_request")
	private WebElement txtOtherReq;

	@FindBy(id = "step2next")
	private WebElement btnNext2;

	@FindBy(xpath = "//h5[text()='Credit/Debit/ATM Card']")
	private WebElement btnDebit;

	@FindBy(id = "payment_type")
	private WebElement ddnCardType;

	@FindBy(id = "card_type")
	private WebElement ddnCard;

	@FindBy(name = "card_no")
	private WebElement txtCardNo;

	@FindBy(name = "card_name")
	private WebElement txtCardName;

	@FindBy(id = "card_month")
	private WebElement ddnMonth;

	@FindBy(id = "card_year")
	private WebElement txtYear;

	@FindBy(id = "cvv")
	private WebElement txtCcv;

	@FindBy(id = "submitBtn")
	private WebElement btnSubmit;

	@FindBy(xpath = "//h5[text()='UPI']")
	private WebElement btnUPI;

	@FindBy(id = "upi_id")
	private WebElement txtUPI;

	@FindBy(xpath = "//h5[text()='The Chancery Hotel Deluxe']")
	private WebElement selectHotel;

	/**
	 * 
	 * @return WebElement
	 * @see Used to get the select hotel name
	 */
	public WebElement getSelectHotel() {
		return selectHotel;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to get the success message (Book Hotel)
	 */
	public WebElement getBookHotelSuccessMsge() {
		return bookHotelSuccessMsge;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to click mySelf radioButton
	 */

	public WebElement getBtnMyself() {
		return btnMyself;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to select the salutation
	 */

	public WebElement getDdnSalutation() {
		return ddnSalutation;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to enter the firstName
	 */

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to enter the lastName
	 */

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to enter the mobileNo
	 */

	public WebElement getTxtMobileNo() {
		return txtMobileNo;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to enter the email
	 */

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to click the gstButton
	 */

	public WebElement getBtnGst() {
		return btnGst;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to enter the regNo
	 */

	public WebElement getTxtRegNo() {
		return txtRegNo;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to enter the companyName
	 */

	public WebElement getTxtCompName() {
		return txtCompName;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to enter the companyAdd
	 */

	public WebElement getTxtCompAdd() {
		return txtCompAdd;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to click the nextButton
	 */

	public WebElement getBtnNext() {
		return btnNext;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to click the smoking
	 */

	public WebElement getBtnSmokingRoom() {
		return btnSmokingRoom;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to click the lateCheckin
	 */

	public WebElement getBtnLateCheckin() {
		return btnLateCheckin;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to enter the otherReq
	 */

	public WebElement getTxtOtherReq() {
		return txtOtherReq;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to click the nextButton
	 */

	public WebElement getBtnNext2() {
		return btnNext2;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to click the debitOption
	 */

	public WebElement getBtnDebit() {
		return btnDebit;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to select the cardType
	 */

	public WebElement getDdnCardType() {
		return ddnCardType;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to select the card(Visa)
	 */

	public WebElement getDdnCard() {
		return ddnCard;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to enter the cardNo
	 */

	public WebElement getTxtCardNo() {
		return txtCardNo;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to enter the cardHolderName
	 */

	public WebElement getTxtCardName() {
		return txtCardName;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to select the month
	 */

	public WebElement getDdnMonth() {
		return ddnMonth;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to enter the year
	 */

	public WebElement getTxtYear() {
		return txtYear;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to enter the cvv
	 */

	public WebElement getTxtCcv() {
		return txtCcv;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to click the submitButton
	 */

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to click the upiOption
	 */

	public WebElement getBtnUPI() {
		return btnUPI;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to enter the upiId
	 */

	public WebElement getTxtUPI() {
		return txtUPI;
	}

	/**
	 * 
	 * @param salutation
	 * @param firstname
	 * @param lastname
	 * @param mobileno
	 * @param email
	 * @param regno
	 * @param companyname
	 * @param companyadd
	 * @param othrereq
	 * @param cardtype
	 * @param card
	 * @param cardno
	 * @param cardname
	 * @param month
	 * @param year
	 * @param cvv
	 * @see To book the hotels with enters all datas by using credit card
	 */
	public void bookHotelWithCard(String salutation, String firstName, String lastName, String mobileNo, String email,
			String regNo, String companyName, String companyAdd, String splReq, String cardType, DataTable dataTable) {
		sleep();
		addGuestDetails(salutation, firstName, lastName, mobileNo, email);
		addGstDetails(regNo, companyName, companyAdd);
		addSpecialRequest(splReq);
		addCardPaymentDetails(cardType, dataTable);
	}

	/**
	 * 
	 * @param salutation
	 * @param firstname
	 * @param lastname
	 * @param mobileno
	 * @param email
	 * @param regno
	 * @param companyname
	 * @param companyadd
	 * @param othrereq
	 * @param upi
	 * @see To book the hotels with enters all datas by using Upi Id
	 */
	public void bookHotelWithUpi(String salutation, String firstName, String lastName, String mobileNo, String email,
			String regNo, String companyName, String companyAdd, String splReq, String upiId) {
		sleep();
		addGuestDetails(salutation, firstName, lastName, mobileNo, email);
		addGstDetails(regNo, companyName, companyAdd);
		addSpecialRequest(splReq);
		addUpiDetails(upiId);
	}

	/**
	 * 
	 * @param salutation
	 * @param firstname
	 * @param lastname
	 * @param mobileno
	 * @param email
	 * @see Used to enter datas for guest details
	 */

	public void addGuestDetails(String salutation, String firstName, String lastName, String mobileNo, String email) {
		elementClick(getBtnMyself());
		selectOptionByText(getDdnSalutation(), salutation);
		elementSendkeys(getTxtFirstName(), firstName);
		elementSendkeys(getTxtLastName(), lastName);
		elementSendkeys(getTxtMobileNo(), mobileNo);
		elementSendkeys(getTxtEmail(), email);

	}

	/**
	 * 
	 * @param regno
	 * @param companyname
	 * @param companyadd
	 * @see Used to enter datas for gst details
	 */

	public void addGstDetails(String regNo, String companyName, String companyAdd) {
		elementClick(getBtnGst());
		elementSendkeys(getTxtRegNo(), regNo);
		elementSendkeys(getTxtCompName(), companyName);
		elementSendkeys(getTxtCompAdd(), companyAdd);
		elementClick(getBtnNext());
	}

	/**
	 * 
	 * @param othrereq
	 * @see Used to enter datas for specialRequest
	 */
	public void addSpecialRequest(String splReq) {
		elementClick(getBtnSmokingRoom());
		elementClick(getBtnLateCheckin());
		elementSendkeys(getTxtOtherReq(), splReq);
		elementClick(getBtnNext2());
	}

	/**
	 * 
	 * @param cardtype
	 * @param card
	 * @param cardno
	 * @param cardname
	 * @param month
	 * @param year
	 * @param cvv
	 * @see To maintains the datas for card details
	 */

	public void addCardPaymentDetails(String cardType, DataTable dataTable) {
		elementClick(getBtnDebit());
		selectOptionByText(getDdnCardType(), cardType);
		List<Map<String, String>> debit = dataTable.asMaps();
		Map<String, String> debit1 = debit.get(0);
		String card = debit1.get("Card");
		String cardNo = debit1.get("Card number");
		String cardHolderName = debit1.get("card holder name");
		String month = debit1.get("Expiry month");
		String year = debit1.get("Expiry year");
		String cvv = debit1.get("cvv");
		selectOptionByText(getDdnCard(), card);
		elementSendkeys(getTxtCardNo(), cardNo);
		elementSendkeys(getTxtCardName(), cardHolderName);
		selectOptionByText(getDdnMonth(), month);
		elementSendkeys(getTxtYear(), year);
		elementSendkeys(getTxtCcv(), cvv);
		elementClick(getBtnSubmit());
	}

	/**
	 * 
	 * @param upi
	 * @see To maintains the datas for Upi
	 * 
	 */
	public void addUpiDetails(String upiId) {
		elementClick(getBtnUPI());
		elementSendkeys(getTxtUPI(), upiId);
		elementClick(getBtnSubmit());

	}

	/**
	 * 
	 * @return String
	 * @see Used to get the actual success message (Book Hotel)
	 */
	public String getSuccessMsgeBookHotel() {
		String actBookHotelSuccessMsge = getTheText(getBookHotelSuccessMsge());
		return actBookHotelSuccessMsge;

	}

	/**
	 * 
	 * @return String
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @see Used to get the booked hotel name
	 */
	public String selectHotel() throws FileNotFoundException, IOException {
		String selectHotel1 = getTheText(getSelectHotel());
		setPropertyFileValue("SelectHotelName", selectHotel1);
		return selectHotel1;

	}

}
