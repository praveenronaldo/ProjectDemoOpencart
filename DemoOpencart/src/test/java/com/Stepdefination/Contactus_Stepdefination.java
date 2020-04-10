package com.Stepdefination;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.BaseClass.BasePage;
import com.Pages.ContactUs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Contactus_Stepdefination extends BasePage {

	ContactUs contact;
	final static Logger logger = LogManager.getLogger(Contactus_Stepdefination.class.getName());

	@Given("^the customer open the cart in the browser$")
	public void the_customer_open_the_cart_in_the_browser() throws Throwable {
		Browserlaunch();
		logger.info("Opencart site launches");
	}

	@When("^the user click on contact us in website$")
	public void the_user_click_on_contact_us_in_website() throws Throwable {
		contact = new ContactUs(driver);
		contact.getContactus();
	}

	@Then("^the user should fill the form of \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" which is displayed$")
	public void the_user_should_fill_the_form_of_which_is_displayed(String Name, String mailid, String complaint)
			throws Throwable {
		contact = new ContactUs(driver);
		contact.getNameofcustomer(Name);
		contact.getAddress(mailid);
		contact.getQuery(complaint);
		File filepic = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(filepic, new File("src\\test\\resources\\Screenshots\\Contactuspic.png"));

		} catch (IOException e) {
			System.out.println("IO Excp...." + e.getMessage());
		}

	}

	@Then("^the user click the submit button$")
	public void the_user_click_the_submit_button() throws Throwable {
		contact.getSubmission();
	}

	@And("^user will close the website and browser$")
	public void user_will_close_the_website_and_browser() throws Throwable {
		quit();
	}

}
