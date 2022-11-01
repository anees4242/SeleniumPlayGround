package com.google.factory.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage_PF {

	@FindBy(name = "btnK")
	private WebElement searchBtn;

	@FindBy(name = "q")
	private WebElement searchTxt;

	private WebDriver driver;

	private WebDriverWait wait;

	public SearchPage_PF(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	public void search(String term) {
		searchTxt.sendKeys(term);
		wait.until(ExpectedConditions.elementToBeClickable(searchBtn));
		searchBtn.click();
	}

	public void goTo(String url) {
		this.driver.get(url);
	}

}
