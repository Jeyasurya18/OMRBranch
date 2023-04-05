package com.reports;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import com.base.BaseClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

/**
 * 
 * @author JeyaSurya
 * @Date 22-03-2023
 * @see Used for generating JVM report
 *
 */

public class Reporting extends BaseClass {
	/**
	 * 
	 * @param jsonFile
	 * @see Used for detail explanation in our project
	 */
	public static void jvmReport(String jsonFile) {

		File f = new File(getProjectPath() + "\\target");

		Configuration configuration = new Configuration(f, "OMRBranchHotelAutomation");
		configuration.addClassifications("Platform", "windows10");
		configuration.addClassifications("Author", "Surya");
		configuration.addClassifications("Sprint", "01");

		List<String> addFile = new LinkedList<String>();
		addFile.add(jsonFile);

		ReportBuilder reportBuilder = new ReportBuilder(addFile, configuration);
		reportBuilder.generateReports();

	}

}
