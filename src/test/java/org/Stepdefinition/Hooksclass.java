
package org.Stepdefinition;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utilities.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooksclass extends BaseClass{
	@Before
	public static void browseropen() {
browserlaunch();
maxWindow();
launchurl("https://www.autobarn.net/");
		
	}
	
	@After
	public static void browserclose(Scenario s) throws IOException {
		
		
		if (s.isFailed()) {
			
			TakesScreenshot tk=(TakesScreenshot)driver;
			byte[] screenshot = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshot, "image/png");
		}
		
		closebrowser();
	}
	

}










//if (s.isFailed()) {
	
	//String name = s.getName();
	//String sName = name.replace(" ", "_");
	//Screenshot(sName);
	
//}
