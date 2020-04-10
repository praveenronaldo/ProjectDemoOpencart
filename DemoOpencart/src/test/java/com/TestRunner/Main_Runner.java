package com.TestRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature/Opencart.feature", 
plugin = { "pretty","html:reports/cucumber-html-report", "json:reports/cucumber-html-report/jsonreport",
		   "com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html" },
		// plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = { "@tc01_login, @tc02_Search, @tc03_AddToCart, @tc04_Comparison,@tc05_Brands,@tc06_Special,@tc_07_Review,@tc08_Contactus " }, 
		glue = {"com.Stepdefination" }, 
		monochrome = true
// dryRun=false
)

public class Main_Runner {
	@AfterClass
	public static void extentReport() {
		Reporter.loadXMLConfig("src/test/resources/testdata/Extent_Reports.xml");
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Windows");
		Reporter.setTestRunnerOutput("Sample test runner output message");
	}

}
