package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BasePage;

public class ContactUs extends BasePage {

	@FindBy(linkText = "Contact Us")
	WebElement Contact;
	@FindBy(xpath = "//input[@id='input-name']")
	WebElement name;
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement mailaddress;
	@FindBy(xpath = "//textarea[@id='input-enquiry']")
	WebElement Enquiry;
	@FindBy(xpath = "//input[@value='Submit']")
	WebElement SubButton;

	public ContactUs(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void getContactus() {
		Contact.click();// To click on contact us

	}

	public void getNameofcustomer(String Name) throws InterruptedException {
		name.sendKeys(Name);// To get name

	}

	public void getAddress(String mailid) {
		mailaddress.sendKeys(mailid);// To get mail address
	}

	public void getQuery(String complaint) throws InterruptedException {
		Enquiry.sendKeys(complaint);// To get enquiry
		Thread.sleep(3000);
	}

	public void getSubmission() {
		SubButton.click();// To submit
	}

}
