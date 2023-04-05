package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

/**
 * 
 * @author JeyaSurya
 * @Date 22-03-2023
 * @see Used for maitains the locators for loginPage
 *
 */
public class LoginPage extends BaseClass {
	/**
	 * @see Used to call this page in any class with use of object creation
	 */
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement txtUser;

	@FindBy(id = "pass")
	private WebElement txtPass;

	@FindBy(xpath = "//button[@value='login']")
	private WebElement btnClick;

	@FindBy(xpath = "//b[contains(text(),'Invalid Login')]")
	private WebElement txtErrorMsge;

	/**
	 * 
	 * @return WebElement
	 * @see Used to enter the userName
	 */
	public WebElement getTxtUser() {
		return txtUser;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to enter the passWord
	 */

	public WebElement getTxtPass() {
		return txtPass;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to click the loginButton
	 */

	public WebElement getBtnClick() {
		return btnClick;
	}

	/**
	 * 
	 * @return WebElement
	 * @see Used to get the error message of login
	 */

	public WebElement getTxtErrorMsge() {
		return txtErrorMsge;
	}

	/**
	 * 
	 * @param name
	 * @param pass
	 * @see To maintain the common step for loginpage
	 */

	public void loginCommonStep(String username, String password) {
		elementSendkeys(getTxtUser(), username);
		elementSendkeys(getTxtPass(), password);
	}// 1&3 Scenario

	/**
	 * 
	 * @param name
	 * @param pass
	 * @see Used for click operation
	 */
	public void loginWithClick(String username, String password) {
		loginCommonStep(username, password);
		elementClick(getBtnClick());
	}// 2Scenario

	/**
	 * 
	 * @param name
	 * @param pass
	 * @see Used for click operation with ENTER key
	 */
	public void loginWithEnter(String username, String password) {

		elementSendkeys(getTxtUser(), username);
		elementSendkeysEnter(getTxtPass(), password);

	}

	/**
	 * 
	 * @return String
	 * @see Used to get the actual error message of login
	 */

	public String getLoginErrorMsg() {
		String actLoginErrorMsge = getTheText(getTxtErrorMsge());
		System.out.println(actLoginErrorMsge);
		return actLoginErrorMsge;

	}

}
