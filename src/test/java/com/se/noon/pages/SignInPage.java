package com.se.noon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {

	private By Submit = By.cssSelector("button[id='login-submit']");
	private By PasswordId = By.xpath("//input[@id='passwordInput']");
	private By Email = By.cssSelector("input[id='emailInput']");
	private By SignInBtn = By.cssSelector("span[id='dd_header_signInOrUp']");
	private WebDriver driver;
	private WebElement Btn;
	private WebElement getUserName;
	private WebElement getPassword;
	private WebElement clickSubmitBtn;
	
	public void launch(String url) {
		driver.get(url);
	}

	public SignInPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickSingInBtn() {
		Btn = driver.findElement(SignInBtn);
		Btn.click();

	}

	public void logIn(String username, String password) {

		getUserName = driver.findElement(Email);
		getUserName.sendKeys(username);

		getPassword = driver.findElement(PasswordId);
		getPassword.sendKeys(password);

		clickSubmitBtn = driver.findElement(Submit);
		clickSubmitBtn.click();

	}

	
}
