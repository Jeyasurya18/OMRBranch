package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.BaseClass;
import com.reports.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * 
 * @author JeyaSurya
 * @Date 22-03-2023
 * @see Used for running the Project
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(tags = ("@Cancel"),monochrome=true, dryRun = false, plugin = { "pretty",
		"json:target/OMRBranch.json" }, features = "src\\test\\resources\\Features", glue = "com.stepdefinition")
public class TestRunnerClass extends BaseClass {

	/**
	 * @see Used for generating JVM report in particular name
	 */
    @AfterClass
	public static void report() {
		Reporting.jvmReport(getProjectPath() + "\\target\\OMRBranch.json");

	}

}
