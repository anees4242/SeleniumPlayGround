package com.flipkart.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlipkartSignInPage {

	private By xPath = By.xpath("//button[contains(.,Login)]//span");
	private By cssSelector = By.cssSelector("input[type='password']");
	private By className = By.className("VJZDxU");
	private WebDriver driver;

	public FlipkartSignInPage(WebDriver driver) {
		this.driver = driver;

	}

	public void lauch(String url) {

		driver.get(url);
		System.out.println(driver.getTitle());
		if (!this.driver.getTitle().equals(
				"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")) {
			throw new IllegalStateException("Unable to launch app");
		}
	}

	public void signIn(String username, String password) {
		driver.findElement(className).sendKeys(username);

		driver.findElement(cssSelector).sendKeys(password);

		driver.findElement(xPath).click();
	}

}
