package com.Stepdefination;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.BaseClass.BasePage;
import com.Pages.SpecialsPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Specials_Stepdefination extends BasePage {

	SpecialsPage special;
	final static Logger logger = LogManager.getLogger(AddTocart_Stepdefination.class.getName());

	@Given("^the user to open browser chrome$")
	public void the_user_to_open_browser_chrome() throws Throwable {
		Browserlaunch();
		logger.info("Opencart site launches");
	}

	@When("^the user clicks on the specials$")
	public void the_user_clicks_on_the_specials() throws Throwable {
		special = new SpecialsPage(driver);
		special.specialOffer();
		logger.debug("Product searched ");
	}

	@Then("^the user will see the specials and add to the cart$")
	public void the_user_will_see_the_specials_and_add_to_the_cart() throws Throwable {
		special = new SpecialsPage(driver);
		special.addCart();
		special.checkOut();

		logger.error("Product added to cart");
		File filepic = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(filepic, new File("src\\test\\resources\\Screenshots\\Specialspic.png"));

		} catch (IOException e) {
			System.out.println("IO Excp...." + e.getMessage());
		}
	}

	@Then("^the user close the site and browser$")
	public void the_user_close_the_site_and_browser() throws Throwable {
		quit();
	}

}
