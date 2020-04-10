package com.Stepdefination;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.BaseClass.BasePage;
import com.Pages.ReviewPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Review_Stepdefination extends BasePage {

	ReviewPage reviewpage;
	final static Logger logger = LogManager.getLogger(Review_Stepdefination.class.getName());

	@Given("^Click on MP(\\d+) Players$")
	public void click_on_MP_Players(int arg1) {
		Browserlaunch();
		logger.info("Opencart site launches");
		reviewpage = new ReviewPage(driver);
		reviewpage.mp3Player();
		logger.info("clicked on mp3 players");

	}

	@Then("^Click on Show all MP(\\d+) players$")
	public void click_on_Show_all_MP_players(int arg1) {
		reviewpage.showAllmp3();
		logger.info("clicked on show all mp3 players");
	}

	@Then("^Click on IPod Suffle$")
	public void click_on_IPod_Suffle() {
		reviewpage.ipodShuffle();
		logger.info("clicked on ipod shuffle");
	}

	@Then("^Click on Reviews$")
	public void click_on_Reviews() {
		reviewpage.review();
		logger.info("clicked on reviews icon");
	}

	@Then("^enter review details in details feild$")
	public void enter_review_details_in_details_feild() {
		reviewpage.name("praveen akula");
		logger.info("clicked on your name feild");
		reviewpage.reviewFeild("The product is having issues like draining battery");
		logger.info("clicked on review feild");
	}

	@Then("^click on continue$")
	public void click_on_continue() throws InterruptedException {
		reviewpage.radioBtn();
		logger.info("clicked on rating radio button");
		Thread.sleep(20);
		reviewpage.submit();
		logger.info("clicked on submit button");

		File filepic = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(filepic, new File("src\\test\\resources\\Screenshots\\Reviewpic.png"));

		} catch (IOException e) {
			System.out.println("IO Excp...." + e.getMessage());
		}
		logger.info("screenshot taken");
		driver.quit();
	}

}
