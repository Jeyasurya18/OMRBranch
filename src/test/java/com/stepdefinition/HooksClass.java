package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

/**
 * 
 * @author JeyASurya
 * @Date 28-03-2023
 * @see Used to maintain the before and after steps of the project
 *
 */
public class HooksClass extends BaseClass {

	/**
	 * 
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @see Used to maintain the before steps of the project
	 */
	@Before
	public void beforeScenario() throws FileNotFoundException, IOException {
		getDriver(getPropertyFileValue("browserType"));
		enterAppUrl(getPropertyFileValue("url"));
		maximizeWindow();
		implicitWait(60);

	}

	/**
	 * 
	 * @param scenario
	 * @see Used to maintain the after steps of the project
	 */
	@After
	public void afterScenario(Scenario scenario) {

		boolean b = scenario.isFailed();

		if (b) {
			scenario.attach(screenshot(), "image/png", "Every Scenario");

		}
		closeAllWindow();

	}

}
