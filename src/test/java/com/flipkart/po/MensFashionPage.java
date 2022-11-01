package com.flipkart.po;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MensFashionPage {

	private final By menTab = By.xpath("(//span[contains(@class,'_2I9KP_')])[3]");
	private WebDriver driver;
	private WebElement clickMen;
	private WebElement getPageFilter;
	private WebElement clickTshirt;
	public WebDriverWait Wait;

	public MensFashionPage(WebDriver driver) {
		this.driver = driver;
 
	getPageFilter=	driver.findElement(By.className("_3sckoD"));
	Assert.assertEquals(getPageFilter.getText(), "Men");

	}

	public void goToMensTshirt()  {
		clickMen = driver.findElement(menTab);
		Actions actions = new Actions(driver);
		actions.moveToElement(clickMen).perform();
		
		
		clickTshirt = driver.findElement(By.linkText("T-Shirts"));
		clickTshirt.click();

		driver.navigate().refresh();
		Wait = new WebDriverWait(this.driver, Duration.of(10, ChronoUnit.SECONDS));
		Assert.assertTrue(driver.getTitle().contains("Buy T-Shirts"),"Application title is"+driver.getTitle());
	}
}
