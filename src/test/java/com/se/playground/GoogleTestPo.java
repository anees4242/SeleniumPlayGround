package com.se.playground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class GoogleTestPo {

	WebDriver driver;

	public GoogleTestPo(WebDriver driver) {
		this.driver = driver;
	}

	@Test

	public void launchGoogle() {

		driver.get("https://www.google.com");

	}

	@Test

	public void gotoTazaFresh() {

		WebElement search = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		search.sendKeys("Taza Fresh meat");

	}

	@Test

	public void clickBtn() {

		WebElement btn = driver.findElement(By.name("btnK"));
		btn.click();

	}
	@AfterTest
	public void afterTest() {
	}

	

}
