package com.flipkart.po;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartTshirtsPO {

	private final By selectTshirt = By.cssSelector("a[title='Solid Men Polo Neck Light Green T-Shirt']");
	WebDriver driver;
	public List<WebElement> tshirt;
	public WebElement Stream;
	private WebElement myCartVerify;
	private WebDriverWait wait;

	public FlipkartTshirtsPO(WebDriver driver) {
		this.driver = driver;
	}

	public void selectTshirts() {

//		driver.findElement(selectTshirt).click();

		// driver.findElements(By.xpath("(//a[@title='Solid Men Polo Neck Green
		// T-Shirt'])[2]"));

		List<WebElement> products = driver.findElements(By.partialLinkText("Solid Men Polo Neck Green T-Shirt"));
		System.out.println("No of products found " + products.size());
		// Assert.assertEquals(products.size(), 3);
		ArrayList<String> productNames = new ArrayList<>();
		HashSet<String> uniqueNames = new HashSet<>();
		for (WebElement product : products) {
//			System.out.println("Products are " + product.getText());
			productNames.add(product.getText());
			uniqueNames.add(product.getText());
		}
		System.out.println("Product names are " + productNames);
		System.out.println("Unique names are " + uniqueNames);
		WebElement thirdProduct = products.get(2);
		System.out.println("Third product is " + thirdProduct.getText());
		String currentWindowHandle = driver.getWindowHandle();
		System.out.println("Current window handle before switch " + currentWindowHandle);
		thirdProduct.click();
//		Set<String> windows = driver.getWindowHandles();

		List<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		String newWindowHandle = driver.getWindowHandle();
		System.out.println("Current window handle after switch " + newWindowHandle);

//		driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL);
		String selectedProductTitle = driver.getTitle();
		System.out.println("Selected Product Title " + selectedProductTitle);
//		assertEquals(thirdProduct.getText(), selectedProductTitle);
//		Stream<WebElement> visibleElements = tshirt.stream().filter(WebElement::isDisplayed);
//		WebElement elementToClick = visibleElements.findFirst().get();
//		elementToClick.click();

		wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));

//		driver.findElement(By.partialLinkText("L")).click();
//
//		driver.findElement(By.className("_2KpZ6l _2U9uOA _3v1-ww"));
//
//		myCartVerify = driver.findElement(By.xpath("//div[@class='_3g_HeN']"));
//		Assert.assertEquals(myCartVerify.getText(), "My Cart (1)");

	}

}
