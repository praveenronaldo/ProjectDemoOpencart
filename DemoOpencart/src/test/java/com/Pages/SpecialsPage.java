package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BasePage;

public class SpecialsPage extends BasePage {

	@FindBy(linkText = "Specials")
	WebElement offers;
	@FindBy(xpath = "//div[@id='content']/div[2]/div/div/div[2]/div[2]/button/span")
	WebElement Addtocart;
	@FindBy(xpath = "//span[contains(.,'Checkout')]")
	WebElement Check;

	public SpecialsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void specialOffer() throws InterruptedException {
		offers.click();// To click on offers
		Thread.sleep(3000);
	}

	public void addCart() throws InterruptedException {
		Addtocart.click();// To click on add to cart
		Thread.sleep(3000);
	}

	public void checkOut() throws InterruptedException {
		Check.click();// To click on check
		Thread.sleep(3000);

	}

}
