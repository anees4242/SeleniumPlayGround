package com.se.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

	private WebElement usernameTxt;
	private WebElement passwordTxt;
	private WebElement loginBtn;
	private WebDriver driver;
	private WebElement newPasswordTxt;
	private WebElement confirmPasswordTxt;
	private WebElement resetBtn;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void login(String username, String password) {
		usernameTxt = driver.findElement(By.xpath(""));
		usernameTxt.sendKeys(username);
		passwordTxt = driver.findElement(By.xpath(""));
		passwordTxt.sendKeys(password);
		loginBtn = driver.findElement(By.xpath(""));
		loginBtn.click();
	}
	
	public void resetPassword(String username, String newPassword) {
		usernameTxt = driver.findElement(By.xpath(""));
		usernameTxt.sendKeys(username);
		newPasswordTxt = driver.findElement(By.xpath(""));
		newPasswordTxt.sendKeys(newPassword);
		confirmPasswordTxt = driver.findElement(By.xpath(""));
		confirmPasswordTxt.sendKeys(newPassword);
		resetBtn = driver.findElement(By.xpath(""));
		resetBtn.click();
	}
	

}
