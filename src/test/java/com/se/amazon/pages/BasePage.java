package com.se.amazon.pages;

import org.openqa.selenium.WebDriver;

public class BasePage {

	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getTitle() {
		return this.driver.getTitle();
	}
	
	public String getCurrrentUrl() {
		return this.driver.getCurrentUrl();
	}
	
	public String getPageSource() {
		return this.getPageSource();
	}
}
