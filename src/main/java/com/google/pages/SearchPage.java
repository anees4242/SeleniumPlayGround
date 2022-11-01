package com.google.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

	private final By searchBtn = By.name("btnK");

	private final By searchTxt = By.name("q");

	private WebDriver driver;

	private WebDriverWait wait;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
	}

	public void search(String term) {
		driver.findElement(searchTxt).sendKeys(term);
		wait.until(ExpectedConditions.elementToBeClickable(searchBtn));
		driver.findElement(searchBtn).click();
	}

	public void goTo(String url) {
		this.driver.get(url);
	}

}
