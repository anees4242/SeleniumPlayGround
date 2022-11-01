package com.se.amazon.pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

	private WebDriver driver;

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void goTo(String url) {
		driver.get(url);
	}

}
