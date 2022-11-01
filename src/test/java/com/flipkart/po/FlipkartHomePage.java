package com.flipkart.po;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartHomePage {

	private final By MensTopWearMenu = By.linkText("Men's Top Wear");
	private final By h1 = By.tagName("h1");
	private final By CSS_SELECTOR = By.xpath("//div[@class='_1psGvi SLyWEo']");
	private final By XPATH = By.xpath("//div[@class='_1psGvi _3BvnxG']//*[text()='Mohammed']");
	private WebDriver driver;
	private WebElement loginName;
	private WebElement fashionTab;
	private WebDriverWait wait;
	protected String pageName = "Home Page";

	public FlipkartHomePage(WebDriver driver) {
		this.driver = driver;

	}

	public String getUserName() {
		driver.navigate().refresh();
		loginName = driver.findElement(XPATH);

		return loginName.getText();

	}

	public void goToFashion() throws InterruptedException {
		fashionTab = driver.findElement(CSS_SELECTOR);
		moveToElement(fashionTab);

		Thread.sleep(5000);

//		List<WebElement> value = driver.findElements(By.cssSelector("a[class='_6WOcW9']"));
//		System.out.println("Total Tab element on the Page is "+value.size());
		wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(CSS_SELECTOR));
		// driver.manage().timeouts().implicitlyWait(Duration.of(10,
		// ChronoUnit.SECONDS));
		// div[@class='productContainer']/a/div/div/div[1]/div[2]/div[2]/button
		driver.findElement(MensTopWearMenu).click();

	}

	private void moveToElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	/*
	 * public String getPageName() {
	 * 
	 * driver.navigate().refresh(); Mensfashion = driver.findElement(TAG_NAME);
	 * return Mensfashion.getText();
	 * 
	 * }
	 */
}
