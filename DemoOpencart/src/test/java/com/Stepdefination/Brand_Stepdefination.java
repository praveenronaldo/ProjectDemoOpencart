package com.Stepdefination;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.BaseClass.BasePage;
import com.Pages.BrandPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Brand_Stepdefination extends BasePage {

	BrandPage Branded;
	final static Logger logger = LogManager.getLogger(Brand_Stepdefination.class.getName());

	@Given("^the user launching the chrome browser$")
	public void the_user_launching_the_chrome_browser() throws Throwable {
		Browserlaunch();
		logger.info("Opencart site launches");
	}

	@When("^the user clicks on brands$")
	public void the_user_clicks_on_brands() throws Throwable {
		Branded = new BrandPage(driver);
		Branded.getBrand();
		logger.debug("selected brands ");

	}

	@Then("^the user selects the brand$")
	public void the_user_selects_the_brand() throws Throwable {
		Branded = new BrandPage(driver);
		Branded.getProduct();
		logger.error("product selected");
	}

	@Then("^the user add the product to wishlist$")
	public void the_user_add_the_product_to_wishlist() throws Throwable {
		Branded = new BrandPage(driver);
		Branded.addToWishlist();
		logger.trace("Added to wishlist");
		File filepic = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(filepic, new File("src\\test\\resources\\Screenshots\\Wishlistpic.png"));

		} catch (IOException e) {
			System.out.println("IO Excp...." + e.getMessage());
		}

	}

	@Then("^the user quits the chrome$")
	public void the_user_quits_the_chrome() throws Throwable {
		quit();
	}

}
