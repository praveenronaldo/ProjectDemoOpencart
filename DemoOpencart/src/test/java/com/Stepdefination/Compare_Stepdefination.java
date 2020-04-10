package com.Stepdefination;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.BaseClass.BasePage;
import com.Pages.ComparePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Compare_Stepdefination extends BasePage {

	ComparePage comparing;
	final static Logger logger = LogManager.getLogger(Compare_Stepdefination.class.getName());

	@Given("^the user launched the browser in chrome$")
	public void the_user_launched_the_browser_in_chrome() throws Throwable {
		Browserlaunch();
		logger.info("Opencart site launches");
	}

	@When("^the user compared the two products$")
	public void the_user_compared_the_two_products() throws Throwable {
		comparing = new ComparePage(driver);
		comparing.getProductA1();
		comparing.getProductA2();
		logger.debug("Product compared");
	}

	@Then("^the user will see product comparison$")
	public void the_user_will_see_product_comparison() throws Throwable {
		comparing.getComparisons();
		logger.error("Product comprison completed");
		File filepic = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(filepic, new File("src\\test\\resources\\Screenshots\\Comparepic.png"));

		} catch (IOException e) {
			System.out.println("IO Excp...." + e.getMessage());
		}

	}

	@Then("^the user closed the browser after comparsion$")
	public void the_user_closed_the_browser_after_comparsion() throws Throwable {
		quit();
	}

}
