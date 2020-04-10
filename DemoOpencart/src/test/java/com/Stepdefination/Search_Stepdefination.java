package com.Stepdefination;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.BaseClass.BasePage;
import com.Pages.SearchPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search_Stepdefination extends BasePage {

	SearchPage search;
	final static Logger logger = LogManager.getLogger(Search_Stepdefination.class.getName());

	@Given("^the user launch the browser$")
	public void the_user_launch_the_browser() throws Throwable {
		Browserlaunch();
		logger.info("Opencart site launches");
	}

	@When("^the user opens the open cart search (.+) page$")
	public void the_user_opens_the_open_cart_search_page(String names) throws Throwable {
		search = new SearchPage(driver);
		search.searchBox();
		search.opencartSearch("IMAC");
		logger.debug("Product searched ");

	}

	@Then("^the user search the product$")
	public void the_user_search_the_product() throws Throwable {
		search = new SearchPage(driver);
		search.button();
		logger.error("Searching for selected product");
		File filepic = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(filepic, new File("src\\test\\resources\\Screenshots\\Searchpic.png"));

		} catch (IOException e) {
			System.out.println("IO Excp...." + e.getMessage());
		}

	}

	@Then("^the user close the browesr$")
	public void the_user_close_the_browesr() throws Throwable {
		quit();
	}

}
