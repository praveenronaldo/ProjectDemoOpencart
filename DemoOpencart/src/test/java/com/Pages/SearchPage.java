package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BasePage;

public class SearchPage extends BasePage {

	@FindBy(xpath = "//div[@id='search']/input")
	WebElement searchpage;
	@FindBy(xpath = "//*[@id=\"search\"]/span/button")
	WebElement searchbtn;

	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void searchBox() {
		searchpage.click();// To click on search
	}

	public void opencartSearch(String names) throws InterruptedException {

		searchpage.sendKeys(names);// To enter search
		Thread.sleep(3000);
	}

	public void button() throws InterruptedException {
		searchbtn.click();// To click on search button
		Thread.sleep(3000);
	}

}
