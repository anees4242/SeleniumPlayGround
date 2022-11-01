package com.se.playground;

import static java.time.temporal.ChronoUnit.SECONDS;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest {

	private WebDriver driver;

	@BeforeSuite
	public void beforeSuite() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.of(15, SECONDS));

	}

	@BeforeTest
	public void beforeTest() {
		driver.get("https://www.amazon.com/");
//		if (!driver.getTitle().equals("Amazon.com")) {
//			throw new IllegalStateException("Unable to launch the application");
//		}
		Assert.assertEquals(driver.getTitle(), "Amazon.com. Spend less. Smile more.");
	}

	@Test(priority = 1)
	public void login() {

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

	@Test(priority = 2)
	public void searchProduct() {

		WebElement findItem = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		findItem.sendKeys("shoes for men");

		WebElement selectGo = driver.findElement(By.cssSelector("input[id='nav-search-submit-button']"));
		selectGo.click();

	}
	/*
	 * public void searchProduct(String name) throws InterruptedException,
	 * ArithmeticException { // search the product by name Thread.sleep(3000); int
	 * result = 21 / 0; }
	 */

	@Test(priority = 3)
	public void addToCart() {

//		WebElement productToSelect = driver.findElement(By.xpath("(//span[contains(.,'Eureka Walking Shoe')])[2]"));
		List<WebElement> shoes = driver.findElements(By.xpath("//span[contains(.,'Eureka Walking Shoe')]"));
//		if(!shoes.isEmpty()) shoes.get(0).click();
//		if(shoes.size()!=0) shoes.get(0).click();
		shoes.stream().filter(WebElement::isDisplayed).filter(e -> e.getText().contains("Eureka Walking Shoe"))
				.findFirst().get().click();
//        js.executeScript("arguments[0].scrollIntoView();", productToSelect);
//		productToSelect.click();

		WebElement colourSelect = driver.findElement(By.xpath("(//img[contains(@alt,'Chocolate Nubuck')])[1]"));
		colourSelect.click();

		WebElement sizeCheck = driver
				.findElement(By.xpath("//span[@id='size_name_2' or @id='native_dropdown_selected_size_name']"));
		sizeCheck.click();

		WebElement sizeSelect = driver.findElement(By.xpath("(//a[@id='native_dropdown_selected_size_name_3'])"));
		sizeSelect.click();

		WebElement checkOutBtn = driver.findElement(By.xpath("//span[@id='submit.add-to-cart-announce']"));
		checkOutBtn.click();

		WebElement cofirmation = driver.findElement(By.name("Added to Cart"));
		Assert.assertEquals(cofirmation.getText(), "Added to cart");

	}

	@Test(priority = 4)
	public void checkOut() {
		System.out.println("Checkout");
	}

//	private boolean isDisplayed(WebElement element) {
//		try {
//			return element.isDisplayed();
//		} catch (NoSuchElementException e) {
//			return false;
//		}
//	}

	@AfterTest
	public void afterTest() {

		/*
		 * driver.close();
		 * 
		 * }
		 * 
		 * @AfterSuite public void afterSuite() {
		 * 
		 * driver.quit(); }
		 */
	}
}
