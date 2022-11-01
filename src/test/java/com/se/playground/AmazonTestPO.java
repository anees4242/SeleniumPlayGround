package com.se.playground;

import org.testng.annotations.Test;

import com.se.amazon.pages.HomePage;
import com.se.amazon.pages.LoginPage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import static java.time.temporal.ChronoUnit.SECONDS;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class AmazonTestPO {
	private ChromeDriver driver;
	private LoginPage loginPage;
	private HomePage homePage;
	

	@Test
	public void loginWithValidCredentials() {
		String username = "919094242987";
		String passsword = "Password12#";
		loginPage.login(username, passsword);
	}
	
	@Test
	public void resetPassword() {
		String username = "919094242987";
		String newPassword = "Password!@";
		loginPage.resetPassword(username, newPassword);
		
	}

	@BeforeTest
	public void beforeTest() {
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		homePage.goTo("https://www.amazon.com");
	}

	@AfterTest
	public void afterTest() {
	}

	@BeforeSuite
	public void beforeSuite() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.of(15, SECONDS));
	}

	@AfterSuite
	public void afterSuite() {
	}

}
