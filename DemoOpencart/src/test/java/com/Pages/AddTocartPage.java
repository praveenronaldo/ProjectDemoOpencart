package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BasePage;

public class AddTocartPage extends BasePage {

	@FindBy(xpath = "//div[@id='search']/input")
	WebElement searchpages;
	@FindBy(xpath = "//*[@id=\"search\"]/span/button")
	WebElement searchbtns;
	@FindBy(xpath = "//div[@id='content']/div[3]/div/div/div[2]/div[2]/button/span")
	WebElement addtocart;

	public AddTocartPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void textSearchBox() {
		searchpages.click();// To click on search
	}

	public void getSearch(String names) {

		searchpages.sendKeys(names);// To enter in search box
	}

	public void buttonPress() throws InterruptedException {
		searchbtns.click();// To click on search button
		Thread.sleep(3000);
	}

	public void add() throws InterruptedException {
		addtocart.click();// To click on add to cart
		Thread.sleep(3000);
	}

}
