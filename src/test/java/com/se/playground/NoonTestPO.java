package com.se.playground;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.se.noon.pages.HomePage;
import com.se.noon.pages.SignInPage;

public class NoonTestPO {

	private Duration SECONDS = Duration.ofSeconds(10);
	private HomePage homePage;
	private SignInPage signInPage;
	private WebDriver driver;
	private AddToCart AddTocart;

	@BeforeSuite
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(SECONDS);
	}

	@AfterSuite
	public void teardown() {
		// driver.quit();
	}

	@Test(priority = 1)

	public void validLogin() {
		String username = "mdanees4242@gmail.com";
		String password = "Password12#";
		String url = "https://www.noon.com";

		signInPage = new SignInPage(driver);
		signInPage.launch(url);
		signInPage.clickSingInBtn();
		signInPage.logIn(username, password);
		homePage = new HomePage(driver);
		Assert.assertEquals(homePage.getUsername(), "Hala Mohammed!");
	}

	@Test(priority = 2)
	public void addToCart() {
		AddTocart = new AddToCart(driver);
		AddTocart.selectItem();

		Assert.assertEquals(AddTocart.verifyProduct(), "air jordana shoes");

	}
}
