package com.se.playground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCart {

	private By verifyName = By.tagName("h1");
	private By listing = By.xpath("(//div[contains(@class,'5 evkhgb')])[2]");
	private By itemsearch = By.cssSelector("input[id='searchBar']");
	private WebDriver driver;
	private WebElement findShoeWithKeyword;
	private WebElement listingOfShoes;
	private WebElement verifyGivenKeyword;

	public AddToCart(WebDriver driver) {
		this.driver = driver;
	}

	public void selectItem() {
	//Searching for the shoe with Keyword "Air Jodan" 
		findShoeWithKeyword = driver.findElement(itemsearch);
		findShoeWithKeyword.sendKeys("Air Jordan");

	// showing Air jodan shoe by the listed search
		listingOfShoes = driver.findElement(listing);
		listingOfShoes.click();

	}

	//Asserting the exact shoes are listed with given Keyword 
	public String verifyProduct() {
		verifyGivenKeyword = driver.findElement(verifyName);
		return verifyGivenKeyword.getText();
	}

}
