package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * 
 * @author JeyaSurya
 * @Date 22-03-2023
 * @see To maintain the methods for login operation with valid and invalid datas
 *
 */
public class TC1_LoginStep extends BaseClass {
	PageObjectManager pom = new PageObjectManager();

	/**
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @see Used for launch the OMR Branch hotel page
	 */
	@Given("User is on OMR Branch hotel page")
	public void user_is_on_omr_branch_hotel_page() throws FileNotFoundException, IOException {

	}

	/**
	 * 
	 * @param userName
	 * @param passWord
	 * @see Used for login the hotel with valid data and invalid data
	 */

	@When("User login {string},{string}")
	public void user_login(String username, String password) {
		pom.getLoginPage().loginWithClick(username, password);

	}

	/**
	 * 
	 * @param userName
	 * @param passWord
	 * @see Use for login operation with the use of ENTER key
	 */

	@When("User login {string},{string} with ENTER key")
	public void user_login_with_enter_key(String username, String password) {
		pom.getLoginPage().loginWithEnter(username, password);

	}

	/**
	 * 
	 * @param expErrorMsge
	 * @see Used for verify the error message after passing invalid datas
	 */

	@Then("User should verify error message after login {string}")
	public void user_should_verify_error_message_after_login(String expLoginErrorMsge) {

		Assert.assertTrue("Verify after login with invalid credential error message contains",
				pom.getLoginPage().getLoginErrorMsg().contains(expLoginErrorMsge));

	}

}