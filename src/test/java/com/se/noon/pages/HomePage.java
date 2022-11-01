package com.se.noon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private By UserName = By.cssSelector("span[class='userName']");
	private WebDriver driver;
	private WebElement UserTxt;

	public HomePage(WebDriver driver) {
		this.driver = driver;

	}

	//Verfiying the correct User is loggedIn
	public String getUsername() {
		UserTxt = driver.findElement(UserName);
		return UserTxt.getText();
	}

}
