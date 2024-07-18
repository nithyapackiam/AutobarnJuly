
package org.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	
	public static void generateJvmReport(String jsonFilePath) {
		
		File f=new File(System.getProperty("user.dir")+"\\target\\Reports\\Jvm");
		
		Configuration con=new Configuration(f, "Autobarn Project");
		con.addClassifications("Browser Name", "Chrome");
		con.addClassifications("Browser version", "42");
		con.addClassifications("OS", "Windows");
		con.addClassifications("Platformrole", "mobile");
		con.addClassifications("System Manufacturer", "HP");

		List<String> li=new ArrayList<String>();
		li.add(jsonFilePath);
		
		
		ReportBuilder r=new ReportBuilder(li, con);
		r.generateReports();
		
	}
}
