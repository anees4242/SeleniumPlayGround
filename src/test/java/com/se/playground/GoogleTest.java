package com.se.playground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GoogleTest {

	private WebDriver driver;

	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void login() throws InterruptedException {
		driver.get("http://www.google.com/ncr");
		WebElement searchTxt = driver.findElement(By.name("q"));
		searchTxt.sendKeys("taza freshmeat");
		Thread.sleep(3000);
		WebElement searchBtn = driver.findElement(By.cssSelector("[name='btnK']"));
		// *[text()='Login'] - Exact match
		// button[contains(.,'Login')] - Partial match
		// button[contains(text(),'Login')] - Partial match
//		(//button[contains(.,'Login')])[2]
		searchBtn.click();
		Assert.assertEquals(driver.getTitle().substring(0, 14), "taza freshmeat");
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
