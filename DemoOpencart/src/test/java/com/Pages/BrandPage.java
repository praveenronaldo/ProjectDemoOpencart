package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BasePage;

public class BrandPage extends BasePage {

	@FindBy(linkText = "Brands")
	WebElement Brand;
	@FindBy(linkText = "Apple")
	WebElement AppleBrand;
	@FindBy(xpath = "(//button[@type='button'])[10]")
	WebElement Wishlist;

	public BrandPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void getBrand() throws InterruptedException {
		Brand.click();// To click on brand
		Thread.sleep(3000);
	}

	public void getProduct() throws InterruptedException {
		AppleBrand.click();// To click on apple brand
		Thread.sleep(3000);
	}

	public void addToWishlist() throws InterruptedException {
		Wishlist.click();// To click on wishlist
		Thread.sleep(3000);
	}

}
