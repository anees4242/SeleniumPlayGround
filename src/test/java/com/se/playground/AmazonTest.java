package com.se.playground;

import static java.time.temporal.ChronoUnit.SECONDS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest {

	private WebDriver driver;
	private JavascriptExecutor js;

	@BeforeSuite
	public void beforeSuite() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.of(15, SECONDS));
        js = (JavascriptExecutor) driver;

	}

	@BeforeTest
	public void beforeTest() {
		driver.get("https://www.amazon.com/");
		Assert.assertEquals(driver.getTitle(), "Amazon.com. Spend less. Smile more.");
	}

	@Test
	public void login() throws InterruptedException {

		WebElement signInOption = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		signInOption.click();

		WebElement userName = driver.findElement(By.cssSelector("input[id='ap_email']"));
		userName.sendKeys("919094242987");

		WebElement continueBtn = driver.findElement(By.xpath("//input[@tabindex='5']"));
		continueBtn.click();

		WebElement password = driver.findElement(By.cssSelector("[name='password']"));
		password.sendKeys("Password12#");

		WebElement logInBtn = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		logInBtn.click();

		WebElement greeting = driver.findElement(By.xpath("//span[text()='Hello, mohammed']"));

		Assert.assertEquals(greeting.getText(), "Hello, mohammed");

	}

	@Test
	public void searchProduct() throws InterruptedException {

		WebElement findItem = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		findItem.sendKeys("shoes for men");

		WebElement selectGo = driver.findElement(By.cssSelector("input[id='nav-search-submit-button']"));
		selectGo.click();

	}

	@Test
	public void addToCart() {

		WebElement productToSelect = driver.findElement(By.xpath("(//span[contains(.,'Eureka Walking Shoe')])[3]"));
        js.executeScript("arguments[0].scrollIntoView();", productToSelect);
		productToSelect.click();

		WebElement colourSelect = driver.findElement(By.xpath("(//span[contains(@id,'color_name_2')])[1]"));
		colourSelect.click();

	}

	@Test
	public void checkOut() {
	}

	@AfterTest
	public void afterTest() {
	}

	@AfterSuite
	public void afterSuite() {
	}

}
