package com.Stepdefination;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.BaseClass.BasePage;
import com.Pages.AddTocartPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddTocart_Stepdefination extends BasePage {

	AddTocartPage addcart;
	final static Logger logger = LogManager.getLogger(AddTocart_Stepdefination.class.getName());

	@Given("^the user launches the browser in chrome$")
	public void the_user_launches_the_browser_in_chrome() throws Throwable {

		Browserlaunch();
		logger.info("Opencart site launches");
	}

	@When("^the user opens the cart and search  product called (.+)$")
	public void the_user_opens_the_cart_and_search_page_called(String name) throws Throwable {
		addcart = new AddTocartPage(driver);
		addcart.textSearchBox();
		addcart.getSearch("IMAC");
		logger.debug("Product searched ");
	}

	@Then("^the user searches the product and choose$")
	public void the_user_searches_the_product_and_choose() throws Throwable {
		addcart = new AddTocartPage(driver);
		addcart.buttonPress();
		logger.error("Product adding to cart");
	}

	@Then("^the user add the product into cart$")
	public void the_user_add_the_product_into_cart() throws Throwable {
		addcart.add();
		logger.trace("Product added to cart");
		File filepic = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(filepic, new File("src\\test\\resources\\Screenshots\\Addcartpic.png"));

		} catch (IOException e) {
			System.out.println("IO Excp...." + e.getMessage());
		}
	}

	@Then("^the user closees the browser and quit$")
	public void the_user_closees_the_browser_and_quit() throws Throwable {
		quit();
		logger.info("Browser closed");
	}

}
