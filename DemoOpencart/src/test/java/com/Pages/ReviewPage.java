package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BasePage;

public class ReviewPage extends BasePage {

	@FindBy(linkText = "MP3 Players")
	WebElement mp3player;
	@FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[8]/div/a")
	WebElement showallmp3;
	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[3]/div/div[1]/a/img")
	WebElement ipodshuffle;
	@FindBy(id = "input-name")
	WebElement name;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/ul[2]/li[2]/a")
	WebElement review;
	@FindBy(id = "input-review")
	WebElement reviewfeild;
	@FindBy(name = "rating")
	WebElement radio;
	@FindBy(id = "button-review")
	WebElement submit;

	public ReviewPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void mp3Player() {
		mp3player.click();// To click on mp3player
	}

	public void showAllmp3() {
		showallmp3.click();// To click on show all mp3
	}

	public void ipodShuffle() {
		ipodshuffle.click();// To click on ipod shuffle
	}

	public void review() {
		review.click();// To click on review
	}

	public void name(String nameid) {
		name.sendKeys(nameid);// To get name
	}

	public void reviewFeild(String reviewdata) {
		reviewfeild.sendKeys(reviewdata);// To get review field
	}

	public void radioBtn() {
		radio.click();// To click radio button
	}

	public void submit() {
		submit.click();// To click on submit
	}

}
