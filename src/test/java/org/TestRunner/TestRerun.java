
package org.TestRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.JvmReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="@src\\test\\resources\\Rerun\\Failed.txt", glue="org.Stepdefinition", monochrome=true, 
dryRun=false, plugin= {"html:target\\Reports", "junit:target\\Reports\\ab.xml",
"json:target\\Reports\\autobarn.json",
"rerun:src\\test\\resources\\Rerun\\Failed.txt"})



public class TestRerun {
	

	@AfterClass
	public static void fullReport() {
		JvmReport.generateJvmReport(System.getProperty("user.dir")+"\\target\\Reports\\autobarn.json");


	}

}
