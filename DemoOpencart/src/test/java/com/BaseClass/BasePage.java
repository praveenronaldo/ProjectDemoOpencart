package com.BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {

	public WebDriver driver;

	public void Browserlaunch() {// To launch the browser

		String browser = "chrome";

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:/online/chromedriver.exe");
			driver = new ChromeDriver();
		}
		if (browser.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver", "C://online//geckodriver.exe/");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();// To maximize the window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// To wait for specified time
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.opencart.com/");// To get site

	}

	public void quit() {

		driver.close();// To close browser
	}

}
