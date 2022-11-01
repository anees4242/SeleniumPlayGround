package com.flipkart.po;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FlipkartPoTest {

	private WebDriver driver;
	private FlipkartSignInPage signInPage;
	private FlipkartHomePage homePage;
	private MensFashionPage MensFashionPage;
	private FlipkartTshirtsPO FlipkartTshirtsPO;

	@BeforeSuite

	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.of(10, ChronoUnit.SECONDS));

	}

	@AfterSuite

	public void teardown() {

		if (driver != null) {
			driver.quit();
		}

	}

	@Test(priority = 1)
	public void validLogin() {

		String username = "hachibi.mech@gmail.com";
		String password = "mashallah";
		String url = "https://flipkart.com";
		signInPage = new FlipkartSignInPage(driver);
		signInPage.lauch(url);
		signInPage.signIn(username, password);
		homePage = new FlipkartHomePage(driver);
		Assert.assertEquals(homePage.getUserName(), "Mohammed");

	}

	@Test(priority = 2)
	public void clickFashion() throws Exception {
		homePage.goToFashion();
		MensFashionPage = new MensFashionPage(driver);
		MensFashionPage.goToMensTshirt();
		FlipkartTshirtsPO = new FlipkartTshirtsPO(driver);
		FlipkartTshirtsPO.selectTshirts();

		// Assert.assertEquals(homePage.getPageName(), "Men's Fashion!");
	}

}
